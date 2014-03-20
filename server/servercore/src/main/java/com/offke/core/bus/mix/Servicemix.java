package com.offke.core.bus.mix;

import com.offke.core.standard.abstracts.AbstractBasicAtom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

/**
 * <p>原子交易总控</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class Servicemix implements IServicemix {
    private static final Logger _logger = LoggerFactory.getLogger(Servicemix.class);
    private List<IServicemix> security;

    public boolean mix(TradeInfo tradeInfo) {
        _logger.info("TradeCode[{}], Atom[{}]", tradeInfo.tradeCode(), tradeInfo.getAtomInfo().getBeanClass().getName());

        IAtom instance = null;
        boolean isException = false;

        try {
            instance = (IAtom) tradeInfo.getAtomInfo().getObject();
            instance.atomicTransaction(tradeInfo);
        } catch (RuntimeException e) {
            _logger.error("RuntimeException={}", e);
            isException = true;
            throw e;
        } catch (Exception e) {
            isException = true;
            _logger.error("Exception={}", e);
            throw new RuntimeException(tradeInfo.tradeCode(), e);
        } catch (Throwable e) {
            isException = true;
            _logger.error("ThrowableException={}", e);
            throw new RuntimeException(tradeInfo.tradeCode(), e);
        } finally {
            if (instance != null && instance instanceof AbstractBasicAtom) {
                try {
                    ((AbstractBasicAtom) instance).autoTransaction(isException);
                } catch (SQLException e) {
                    _logger.error("SQLException={}", e);
                } finally {
                    if (tradeInfo.getAtomInfo() == null || !tradeInfo.getAtomInfo().isSingleton()) {
                        ((AbstractBasicAtom) instance).clear();
                    }
                }
            }
            instance = null;
        }

        return true;
    }

    public void setSecurity(List<IServicemix> security) {
        this.security = security;
    }

    public List<IServicemix> getSecurity() {
        return security;
    }
}
