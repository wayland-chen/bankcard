package com.offke.core.bus.mix;

import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>环绕服务接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public interface IMix {
    public boolean atom(TradeInfo tradeInfo);
}
