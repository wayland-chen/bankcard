package com.offke.core.standard.interfaces;

import com.offke.core.status.procedure.TradeInfo;

/**
 * 报文接口
 *
 * @version 1.0
 * @since 2012/12/10
 */
public interface IMessage {
    /**
     * 处理接口
     *
     * @param tradeInfo 交易过程数据
     * @return 是否成功
     */
    public boolean handle(TradeInfo tradeInfo);
}
