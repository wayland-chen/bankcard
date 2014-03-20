package com.offke.core.bus.mix;

import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>服务总线接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public interface IServicemix {
    /**
     * <p>总线方法</p>
     *
     * @param tradeInfo
     * @return 调用是否成功
     */
    public boolean mix(TradeInfo tradeInfo);
}
