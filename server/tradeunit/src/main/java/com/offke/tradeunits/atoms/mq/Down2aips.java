package com.offke.tradeunits.atoms.mq;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.bu.struct.entity.TAmsg;
import com.offke.core.bu.struct.entity.TBmsg;
import com.offke.core.bu.struct.entity.TDevice;
import com.offke.core.bu.struct.entity.TSubsystem;
import com.offke.core.bu.struct.pojo.KeyType;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.mgr.KeyFactory;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.messages.json.JsonException;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import com.offke.tradeunits.atoms.aips.download.Msgwrap;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ConnectException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


@Component(
        tradeCode = "10010002",
        tradeName = "消息队列调度(后台下发到综合前置)",
        author = "jiangli",
        comment = "消息队列调度",
        createDate = "2012/05/21",
        singleton = false
)
public class Down2aips extends Atom implements Runnable {
    private static final Logger _logger = LoggerFactory.getLogger(Down2aips.class);

    public final static String Subsystem = "subsystem";
    public final static String Message = "message";

    private TradeInfo tradeInfo;

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
        if (this.tradeInfo != null) {
            String opt = this.tradeInfo.getString(AppConst.opt);
            if (opt != null && opt.equals("doAips")) {
                try {
                    this.doAips((TBmsg) this.tradeInfo.get(AppConst.data));
                } catch (Exception e) {
                    _logger.error("发送同步消息错，", e);
                }
            }
        }
        return true;
    }

    @Override
    public void run() {
        TBmsg msg = null;
        try {
            this.beginTransaction();
            msg = this.get(TBmsg.class, tradeInfo.getString("msgid"), LockMode.UPGRADE);
            if (msg == null) {
                return;
            }

            if (msg.getStatus() == 5 || msg.getStatus() == 6) {
                getSession().persist(genAmsg(msg));
                getSession().delete(msg);
                return;
            }

            Date currDate = new Date();
            if (msg.getExpirationtime() == null) {
                if (msg.getMaxsendcnt() != null && msg.getSendcnt() != null && (msg.getSendcnt() >= msg.getMaxsendcnt() || msg.getSendcnt() > 50)) {
                    msg.setStatus(5);//超出最大发送次数

                    return;
                }
            } else {
                if (currDate.after(msg.getExpirationtime())) {
                    msg.setStatus(6);//超出消息过期时间
                    return;
                }
            }

            msg.setSendcnt(msg.getSendcnt() == null ? 1 : msg.getSendcnt() + 1);
            msg.setStarttime(new Date());

            _logger.info("处理消息【" + tradeInfo.getString("msgid") + "】");

            doAips(msg);

        } catch (ConnectException e) {
            msg.setStatus(3);//通信错误
            _logger.error("ConnectException=" + e.getMessage());
        } catch (Exception e) {
            msg.setStatus(4);//未知错误
            _logger.error("Exception=" + e.getMessage());
        } finally {
            this.commitTransaction();
            this.clear();
        }
    }

    public void doAips(TBmsg msg) throws Exception, JsonException {
        TDevice device = this.get(TDevice.class, msg.getDeviceid());

        if (device == null) {
            return;
        }
        String ip = device.getIp();
        String canaddress = null;
        Integer svrportcnt = device.getSvrportcnt();
        Integer portno = device.getPortno();
        if (device.getFdeviceid() != null && device.getFdeviceid() > 0 && device.getCommtype() != null && device.getCommtype() == 9) {
            canaddress = device.getIp();
            TDevice device9 = this.get(TDevice.class, device.getFdeviceid());
            ip = device9.getIp();
            portno = device9.getPortno();
        }

        TSubsystem subsystem = this.get(TSubsystem.class, device.getSysid());
        if (subsystem == null) {
            msg.setStatus(2);//子系统不存在
        } else {
            IAtom subsys = Atommgr.instance().getPlugin("subsys" + subsystem.getSystype());

            Map<String, Object> data = new LinkedHashMap<String, Object>();
            Map<String, Object> conn = new HashMap<String, Object>();
            conn.put("deviceno", device.getDeviceno());//设备机号
            conn.put("commtype", device.getCommtype());//通信类型
            conn.put("devip", ip);//ip
            conn.put("canaddress", canaddress);//can地址
            conn.put("svrportno", device.getSvrportno());//服务器接口编号
            conn.put("svrportcnt", svrportcnt);//服务器端口总数
            conn.put("port", portno);//端口
            conn.put("baudrate", device.getBaudrate());//波特率
            conn.put("devtype", device.getDevphytype());//设备类型
            conn.put("devmode", device.getDevtypecode());//设备机型
            data.put("conn", conn);
            Map<String, Object> reqdatas = new LinkedHashMap<String, Object>();
            JsonUtil.strToObject(msg.getReqdata(), reqdatas);
            data.put("reqdata", reqdatas);

            Map<String, Object> message = this.tradeInfo.wrap2down(Down2aips.Message);
            message.put(AppConst.CMD, Msgwrap.getCmd(msg.getTradecode()));
            message.put(AppConst.DATA, data);

            this.tradeInfo.get(Message, message);
            this.tradeInfo.get(AppConst.tradecode, msg.getTradecode());
            this.tradeInfo.get(Subsystem, subsystem);
            if (subsys.atomicTransaction(tradeInfo) && msg.getStatus() != 0) {
//                   this.delete( msg );
                msg.setStatus(0);//成功
                msg.setRespata(tradeInfo.rMsg());
                msg.setEndtime(new Date());
                getSession().persist(genAmsg(msg));
                getSession().delete(msg);
            }
            Msgwrap.parseAips(tradeInfo.rMsg(), tradeInfo.puts());
            msg.setDownbuffer(tradeInfo.puts());
        }
    }

    private TAmsg genAmsg(TBmsg msg) {
        TAmsg bmsg = new TAmsg();
        String msgid = KeyFactory.get(KeyType.MSGID);
        bmsg.setMsgid(msgid);
        bmsg.setAmsgid(msg.getMsgid());
        bmsg.setTradecode(msg.getTradecode());
        bmsg.setMsglevel(msg.getMsglevel());
        bmsg.setDeviceid(msg.getDeviceid());
        bmsg.setSleep(msg.getSleep());
        bmsg.setMaxsendcnt(msg.getMaxsendcnt());
        bmsg.setCreatedtime(msg.getCreatedtime());
        bmsg.setExpirationtime(msg.getExpirationtime());
        bmsg.setNextstime(msg.getNextstime());
        bmsg.setStatus(msg.getStatus());
        bmsg.setSendcnt(msg.getSendcnt());
        bmsg.setReqdata(msg.getReqdata());

        return bmsg;
    }

}
