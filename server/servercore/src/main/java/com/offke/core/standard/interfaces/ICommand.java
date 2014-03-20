package com.offke.core.standard.interfaces;

import com.offke.core.status.procedure.TradeInfo;

/**
 * <p>校园通启动命令接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public interface ICommand {
    /**
     * <p>启动执行方法</p>
     *
     * @param tradeInfo
     * @return 是否成功
     */
    public boolean execute(TradeInfo tradeInfo) throws Exception;

    /**
     * <p>停止</p>
     */
    public void stop();
}
