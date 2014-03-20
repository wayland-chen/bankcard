package com.offke.core.bus.mix;

import com.offke.core.status.procedure.TradeInfo;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>环绕服务主控</p>
 */
public class Servicecmix implements MethodInterceptor {
    private static final Logger _logger = LoggerFactory.getLogger(Servicecmix.class);
    private IMix serviceMixBefore;
    private IMix serviceMixAfter;

    public Object invoke(MethodInvocation pro_mi) throws Throwable {
        boolean dealFlag = true;

        TradeInfo tradeInfo = (TradeInfo) pro_mi.getArguments()[0];

        try {
            if (serviceMixBefore == null) {
                throw new RuntimeException("一卡通交易系统发生错误");
            }

            if (serviceMixAfter == null) {
                throw new RuntimeException("一卡通交易系统发生错误");
            }

            serviceMixBefore.atom(tradeInfo);
            pro_mi.proceed();

        } catch (RuntimeException e) {
            tradeInfo.put("zl_99998");
            tradeInfo.put(e.getMessage());
            _logger.error("交易[{}]异常，{}", tradeInfo.getTradeCode(), e);
        } catch (Exception e) {
            tradeInfo.puts().clear();
            tradeInfo.put("zl_99998");
            tradeInfo.put("一卡通交易系统发生错误");
            _logger.error("交易[{}]发生错误，{}", tradeInfo.getTradeCode(), e);
        } finally {
            serviceMixAfter.atom(tradeInfo);
        }


        return dealFlag;
    }

    public void setServiceMixAfter(IMix serviceMixAfter) {
        this.serviceMixAfter = serviceMixAfter;
    }

    public void setServiceMixBefore(IMix serviceMixBefore) {
        this.serviceMixBefore = serviceMixBefore;
    }
}
