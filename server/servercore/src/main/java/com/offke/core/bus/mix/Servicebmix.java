package com.offke.core.bus.mix;

import com.offke.core.common.mgr.BeanProxy;
import com.offke.core.standard.interfaces.IUnPack;
import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>调用原子交易之前的服务处理</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class Servicebmix implements IMix {
    private IUnPack defaultUnpack;

    public boolean atom(TradeInfo tradeInfo) {
        boolean df = false;

        String unpack = tradeInfo.getAtomInfo().getUnpack();
        if (tradeInfo.getUnpack() != null) {
            df = tradeInfo.getUnpack().handle(tradeInfo);
        } else if (unpack != null && !unpack.trim().isEmpty()) {
            IUnPack msg = BeanProxy.lookupBean(unpack);
            if (msg != null) {
                df = msg.handle(tradeInfo);
            }
        } else {
            df = defaultUnpack.handle(tradeInfo);
        }

        if (!df) {
            throw new RuntimeException(tradeInfo.tradeCode());
        }

        return true;
    }

    public void setDefaultUnpack(IUnPack defaultUnpack) {
        this.defaultUnpack = defaultUnpack;
    }

}
