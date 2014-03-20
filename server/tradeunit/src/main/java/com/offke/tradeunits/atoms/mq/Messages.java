package com.offke.tradeunits.atoms.mq;

import com.offke.core.annotation.stereotype.Component;
import com.offke.core.bu.exception.RBaseCode;
import com.offke.core.bu.struct.entity.TBmsg;
import com.offke.core.bu.struct.entity.TDevice;
import com.offke.core.bu.struct.entity.TMsgbind;
import com.offke.core.bu.struct.pojo.KeyType;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.mgr.KeyFactory;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.common.util.Procadapter;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.common.util.Validate;
import com.offke.core.standard.abstracts.Atom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.standard.interfaces.IAtomplugin;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 消息队列生成，调度
 *
 * @version 1.0
 * @since 2012/06/11
 */
@Component(tradeCode = "9000001",
        tradeName = "消息队列生成，调度",
        author = "jiangli",
        createDate = "2012/06/12",
        singleton = true,
        internal = true
)
public class Messages implements IAtomplugin {
    private static final Logger _logger = LoggerFactory.getLogger(Messages.class);

    private final BlockingQueue<TBmsg> bq = new LinkedBlockingQueue<TBmsg>();
    private boolean isStatus = false;

    /**
     * 实例化对象
     *
     * @return self
     * @throws Exception
     */
    public static Object instance() {
        try {
            return Atommgr.instance().getPlugin("9000001");
        } catch (Exception e) {
            throw new RuntimeException("zl_99997", e);
        }
    }


    private void mqWait() {
        while (true) {
            try {
                TBmsg msg = bq.take();
                if (!isStatus) {
                    _logger.info("消息生成队列停止");
                    break;
                }
                run(msg);
            } catch (InterruptedException e) {
                _logger.error("线程调度失败", e);
            }
        }
    }

    protected void run(TBmsg msg) {
        Session session = null;
        try {
            session = SessionUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("from " + TMsgbind.class.getName() + " where tradecode=?");
            query.setParameter(0, msg.getTradecode());

            List<TMsgbind> msgbinds = query.list();
            if (msgbinds.isEmpty()) {
                _logger.warn("交易[" + msg.getTradecode() + "]没有消息绑定消息");
            } else {
                if (msg.getDeviceid() != null && msg.getDeviceid() != 0) {
                    session.persist(msg);
                } else {
                    String devphytype = "";
                    String devtypecode = "";
                    for (TMsgbind bind : msgbinds) {
                        devphytype += bind.getDevtype() + ",";
                        devtypecode += "'" + bind.getDevmode() + "',";
                    }
                    devphytype = devphytype.substring(0, devphytype.length() - 1);
                    devtypecode = devtypecode.substring(0, devtypecode.length() - 1);
                    query = session.createQuery("from " + TDevice.class.getName() + " where status='1' and devphytype in(" + devphytype + ") and devtypecode in(" + devtypecode + ")");
                    List<TDevice> devs = query.list();
                    if (devs.isEmpty()) {
                        _logger.warn("交易[" + msg.getTradecode() + "]没有对应设备");
                    } else {
                        for (TDevice device : devs) {
                            TBmsg bmsg = new TBmsg();
                            String msgid = KeyFactory.get(KeyType.MSGID);
                            bmsg.setMsgid(msgid);
                            bmsg.setAmsgid(msg.getMsgid());
                            bmsg.setTradecode(msg.getTradecode());
                            bmsg.setMsglevel(msg.getMsglevel());
                            bmsg.setDeviceid(device.getDeviceid());
                            bmsg.setSleep(msg.getSleep());
                            bmsg.setMaxsendcnt(msg.getMaxsendcnt());
                            bmsg.setCreatedtime(msg.getCreatedtime());
                            bmsg.setExpirationtime(msg.getExpirationtime());
                            bmsg.setNextstime(msg.getNextstime());
                            bmsg.setStatus(msg.getStatus());
                            bmsg.setSendcnt(0);
                            bmsg.setReqdata(msg.getReqdata());
                            session.persist(bmsg);
                        }
                    }
                }
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            SessionUtil.rollback(session);
            _logger.error("Exception=" + e.getMessage());
        } finally {
            SessionUtil.closeSession(session);
        }
    }

    /**
     * 异常发送消息, 后台处理
     *
     * @param tradecode  交易码
     * @param msglevel   消息级别
     * @param deviceid   设备编号
     * @param sleep      间隔时间
     * @param maxsendcnt 最大发起次数
     * @param reqdata    请求数据
     * @return 批次号
     */
    public String asyn(
            String tradecode,
            Integer msglevel,
            Integer deviceid,
            Integer sleep,
            Integer maxsendcnt,
            Date expirationtime,
            Map<String, Object> reqdata) {
        if (reqdata == null || reqdata.isEmpty()) {
            throw new RuntimeException("消息请求内容不能为空");
        }
        if (Validate.isEmpty(tradecode)) {
            throw new RuntimeException("请求交易码不能为空");
        }

        String msgid = KeyFactory.get(KeyType.MSGID);
        TBmsg msg = new TBmsg();
        msg.setMsgid(msgid);
        msg.setAmsgid(msgid);
        msg.setTradecode(tradecode);
        msg.setMsglevel(msglevel);
        msg.setDeviceid(deviceid);
        msg.setSleep(sleep);
        msg.setMaxsendcnt(maxsendcnt);
        Date date = new Date();
        msg.setCreatedtime(date);
        msg.setExpirationtime(expirationtime);
        msg.setNextstime(date);
        msg.setStatus(1);
        msg.setReqdata(JsonUtil.map2sjson(reqdata));
        bq.add(msg);

        return msgid;
    }

    /**
     * 设备相关
     *
     * @param atom      原子交易
     * @param tradecode 交易码
     * @param deviceid  设置编号
     * @param reqdata   请求数据
     * @return 是否成功
     */
    public Procadapter sync(Atom atom, String tradecode, Integer deviceid, Procadapter reqdata) {
        /*if (reqdata == null) {
            throw new RWarn(RWarn.zl_99997, "消息请求内容不能为空");
        }
        if (Validate.isEmpty(tradecode)) {
            throw new RWarn(RWarn.zl_99997, "请求交易码不能为空");
        }
        if (Validate.isEmpty(deviceid)) {
            throw new RWarn(RWarn.zl_99997, "设备编号不能为空");
        }*/

        String msgid = KeyFactory.get(KeyType.MSGID);
        TBmsg msg = new TBmsg();
        msg.setMsgid(msgid);
        msg.setAmsgid(msgid);
        msg.setMsglevel(9);
        msg.setSleep(0);
        msg.setTradecode(tradecode);
        msg.setDeviceid(deviceid);
        Date date = new Date();
        msg.setCreatedtime(date);
        msg.setNextstime(date);
        msg.setStatus(0);
        msg.setReqdata(JsonUtil.map2sjson(reqdata));

        IAtom instance = atom.instance("10010002");
        TradeInfo otradeInfo = new TradeInfo();
        Procadapter downbuffer = msg.getDownbuffer();

/*
        otradeInfo.get(RBaseCode.opt, "doAips");
        otradeInfo.get(RBaseCode.data, msg);
        instance.atomicTransaction(otradeInfo);
        String code = downbuffer != null ? downbuffer.getString(RBaseCode.reasoncode) : null;
        if (code == null) {
            throw new RWarn(RWarn.zl_99989, "消息队列调度错，获取原因码为空");
        } else if (!code.equals(RWarn.zl_00000)) {
            throw new RWarn(RWarn.zl_99989, downbuffer.getString(RBaseCode.reasonremark));
        }*/

        return downbuffer;


    }


    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        return true;
    }

    @Override
    public boolean init() {
        isStatus = true;
        Thread thread = new Thread() {
            public void run() {
                _logger.info("启动消息生成队列成功");
                mqWait();
            }
        };
        thread.setName("messages");
        thread.setDaemon(true);
        thread.start();

        return true;
    }

    @Override
    public boolean stop() {
        isStatus = false;
        bq.add(new TBmsg());
        return true;
    }
}
