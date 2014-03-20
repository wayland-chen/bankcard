package com.offke.core.bus.mix;

import com.offke.core.status.procedure.TradeInfo;


/**
 * 异步服务接口
 *
 * @version 1.0
 * @since 2012/07/16
 */
public interface IServiceasyn extends IServicemix {
    /**
     * 调用之前
     *
     * @param tradeInfo 过程数据
     */
    void before(TradeInfo tradeInfo);

    /**
     * 注册对象
     *
     * @param proxy
     */
    void regProxy(Object proxy);

    /**
     * 调用之后
     *
     * @param tradeInfo
     */
    void after(TradeInfo tradeInfo);

    /**
     * 调用完成
     */
    void complete(TradeInfo tradeInfo);
}
