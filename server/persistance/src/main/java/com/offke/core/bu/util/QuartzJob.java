package com.offke.core.bu.util;

import com.offke.core.common.mgr.Atommgr;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;

/**
 * 服务代理服务
 *
 * @version 1.0
 * @since 2012/9/15
 */
public class QuartzJob {
    private String tradeCode;

    public void work() throws Exception {
        IAtom atom = Atommgr.instance().getPlugin(tradeCode);
        TradeInfo tradeInfo = new TradeInfo();
        tradeInfo.setTradeCode(tradeCode);
        atom.atomicTransaction(tradeInfo);
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeCode() {
        return tradeCode;
    }

}
