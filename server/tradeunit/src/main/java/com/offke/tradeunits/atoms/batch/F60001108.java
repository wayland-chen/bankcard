package com.offke.tradeunits.atoms.batch;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.standard.abstracts.AbstractBasicAtom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.standard.interfaces.IAtomplugin;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component(
        tradeCode = "60001108",
        tradeName = "消费流水调度",
        author = "jiangli",
        internal = true,
        singleton = true,
        comment = "消费流水调度",
        createDate = "2012/09/05",
        params = {
                @Parameter(inputs = {@Item(explain = "", id = "", name = "")},
                        outputs = {@Item(explain = "", id = "", name = "")})
        },
        modified = {@Modified})
public class F60001108 implements IAtomplugin {
    private static final Logger _logger = LoggerFactory.getLogger(F60001108.class);
    private final static String classify = "splus-expense";
    private boolean isrun = false;

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        IAtom atom = null;
        try {
            atom = Atommgr.instance().getPlugin("60001105");
            tradeInfo.setTradeCode("60001105");
            atom.atomicTransaction(tradeInfo);

//            Logs.log( classify ).info( tradeInfo.puts( ).getString( AppConst.reasoncode ) + ":" + tradeInfo.puts( ).getString( AppConst.reasonremark ) ); 
        } catch (Exception e) {
            _logger.error("Exception,", e);
        } finally {

            if (atom != null) {
                ((AbstractBasicAtom) atom).clear();
            }

        }

        return true;
    }

    @Override
    public boolean init() {
        String _switch = null;
        try {
            _switch = SplusProperties.getReal("wisdragon.expense.switch");
        } catch (IOException e1) {
            _logger.error("开关[wisdragon.expense.switch]配置项不存在");
            return false;
        }
        if (_switch == null || !_switch.equals("true")) {
            _logger.warn("开关[wisdragon.expense.switch]目前属于关闭状态，消费流水无法入账");
            return true;
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e1) {
                }

                isrun = true;
                while (isrun) {
                    //处理方式 1-处理初始化流水,2-处理异常流水

                    TradeInfo tradeInfo = new TradeInfo();
                    Map<String, Object> params = tradeInfo.wrap2down(AppConst.params);
                    tradeInfo.put(AppConst.params, params);
                    Map<String, Object> entity = new HashMap<String, Object>();
                    params.put(AppConst.entity, entity);
                    entity.put("dealcnt", SplusProperties.getConfig("wisdragon.expense.dealcnt"));
                    entity.put("dealflag", "1");
                    atomicTransaction(tradeInfo);

                    tradeInfo = new TradeInfo();
                    params = tradeInfo.wrap2down(AppConst.params);
                    tradeInfo.put(AppConst.params, params);
                    entity = new HashMap<String, Object>();
                    params.put(AppConst.entity, entity);
                    entity.put("dealcnt", SplusProperties.getConfig("wisdragon.expense.dealcnt"));
                    entity.put("dealflag", "2");
                    atomicTransaction(tradeInfo);


                    try {
                        Thread.sleep(30000);
                    } catch (NumberFormatException e) {
                        _logger.error("[wisdragon.expense.sleep]不是数字类型, 调度程序退出");
                        break;
                    } catch (Exception e) {
                    }
                }
            }
        });
        thread.setName(classify);
        thread.start();

        return true;
    }

    @Override
    public boolean stop() {
        isrun = false;
        return true;
    }


}