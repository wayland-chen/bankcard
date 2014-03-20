package com.offke.tradeunits.atoms.batch;

import com.offke.core.AppConst;
import com.offke.core.annotation.stereotype.Component;
import com.offke.core.annotation.stereotype.Item;
import com.offke.core.annotation.stereotype.Modified;
import com.offke.core.annotation.stereotype.Parameter;
import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.standard.abstracts.AbstractBasicAtom;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Component(
        tradeCode = "60001107",
        tradeName = "日结与清理",
        author = "jiangli",
        comment = "日结与清理, 交易链",
        createDate = "2012/09/05",
        internal = true,
        params = {
                @Parameter(inputs = {@Item(explain = "", id = "", name = "")},
                        outputs = {@Item(explain = "", id = "", name = "")})
        },
        modified = {@Modified})
public class F60001107 implements IAtom {
    private static final Logger _logger = LoggerFactory.getLogger(F60001107.class);
    private String logName = "splus-audit";

    @Override
    public boolean atomicTransaction(TradeInfo tradeInfo) {
        String _switch = null;
        try {
            _switch = SplusProperties.getReal("wisdragon.audit.switch");
        } catch (IOException e1) {
            _logger.error("开关[wisdragon.audit.switch]配置项不存在");
            return false;
        }

        if (_switch == null || !_switch.equals("true")) {
            return true;
        }

        try {
            String reasoncode = null;
            IAtom atom = null;
            try {
                atom = Atommgr.instance().getPlugin("60001100");
                tradeInfo.setTradeCode("60001100");
                atom.atomicTransaction(tradeInfo);
                reasoncode = tradeInfo.puts().getString(AppConst.reasoncode);
                _logger.info(
                        tradeInfo.puts().getString(AppConst.reasoncode)
                                + ":"
                                + tradeInfo.puts().getString(AppConst.reasonremark));
            } catch (Exception e) {
                _logger.error("结算错，", e);
                return false;
            } finally {
                if (atom != null) {
                    ((AbstractBasicAtom) atom).clear();
                }
            }
            try {
                if (reasoncode != null && reasoncode.equals("zl_00000")) {
                    tradeInfo.puts().clear();
                    atom = Atommgr.instance().getPlugin("60001104");
                    tradeInfo.setTradeCode("60001104");
                    atom.atomicTransaction(tradeInfo);
                    _logger.info(
                            tradeInfo.puts().getString(AppConst.reasoncode) + ":"
                                    + tradeInfo.puts().getString(AppConst.reasonremark));
                }
            } catch (Exception e) {
                _logger.error("结算后，清理数据错，", e);
                return false;
            } finally {
                if (atom != null) {
                    ((AbstractBasicAtom) atom).clear();
                }
            }
        } catch (Exception e) {
            _logger.error(AppConst.LF + StringUtils.center("Failure F60001107 TradeCode【" + tradeInfo.tradeCode() + "】", AppConst.F80, AppConst.Fy),
                    e);
            throw new RuntimeException(tradeInfo.getAtomInfo().getTradeName());
        }

        _logger.info(
                AppConst.LF
                        + StringUtils.center("Success F60001107 TradeCode【" + tradeInfo.tradeCode() + "】", AppConst.F80, AppConst.Fy));
        return true;
    }
}