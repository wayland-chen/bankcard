package com.offke.core.standard.interfaces;

import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>原子交易接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public interface IAtom {
    /**
     * <p>原子交易方法</p>
     *
     * @param tradeInfo
     * @return 是否成功
     */
    boolean atomicTransaction(TradeInfo tradeInfo);
}
