package com.offke.core.bus.mix;

import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.standard.interfaces.IPack;
import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>调用原子交易之后的服务处理</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class Serviceamix implements IMix {
    private IPack defaultPack;

    public boolean atom(TradeInfo tradeInfo) {
        String jMsg = tradeInfo.getAtomInfo().getPack();
        boolean df = false;
        if (tradeInfo.getPack() != null) {
            df = tradeInfo.getPack().handle(tradeInfo);
        } else if (jMsg != null && !jMsg.isEmpty()) {
            IPack msg = BeanProxy.lookupBean(jMsg);
            if (msg != null) {
                df = msg.handle(tradeInfo);
            }
        } else {
            df = defaultPack.handle(tradeInfo);
        }

        if (!df) {
            throw new RuntimeException(tradeInfo.tradeCode());
        }

        return true;
    }

    public void setDefaultPack(IPack defaultPack) {
        this.defaultPack = defaultPack;
    }
}
