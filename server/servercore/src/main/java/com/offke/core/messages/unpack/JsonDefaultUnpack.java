package com.offke.core.messages.unpack;

import com.offke.core.AppConst;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.standard.interfaces.IUnPack;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>校园通缺省解包接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
@Component("jsondefaultunpack")
public class JsonDefaultUnpack implements IUnPack {
    private static final Logger _logger = LoggerFactory.getLogger(JsonDefaultUnpack.class);

    @SuppressWarnings("unchecked")
    public boolean handle(TradeInfo tradeInfo) {
        _logger.info("Begin JsonDefaultUnpack......");
        try {

            Map<String, Object> lro_unpack = new LinkedHashMap<String, Object>();
            JsonUtil.strToObject(tradeInfo.rMsg(), lro_unpack);
            if (lro_unpack.containsKey(AppConst.CMD)) {
                Map<String, Object> object = (Map<String, Object>) lro_unpack.get(AppConst.CMD);
                tradeInfo.setAppver(object.containsKey(AppConst.appver) ? object.get(AppConst.appver).toString() : null);
                tradeInfo.setAppname(object.containsKey(AppConst.appname) ? object.get(AppConst.appname).toString() : null);
                tradeInfo.setAtomver(object.containsKey(AppConst.atomver) ? object.get(AppConst.atomver).toString() : null);
                tradeInfo.setSrc(object.containsKey(AppConst.src) ? object.get(AppConst.src).toString() : null);
                tradeInfo.setTradeid(object.containsKey(AppConst.tradeid) ? object.get(AppConst.tradeid).toString() : null);
                tradeInfo.setDes(object.containsKey(AppConst.des) ? object.get(AppConst.des).toString() : null);
                tradeInfo.setOperCode(object.containsKey(AppConst.opercode) ? object.get(AppConst.opercode).toString() : null);
                tradeInfo.setSessonid(object.containsKey(AppConst.sessonid) ? object.get(AppConst.sessonid).toString() : null);
                tradeInfo.setWorkdate(object.containsKey(AppConst.workdate) ? object.get(AppConst.workdate).toString() : null);
                tradeInfo.setWorktime(object.containsKey(AppConst.worktime) ? object.get(AppConst.worktime).toString() : null);

                _logger.debug("cmd=[{}]", object);

            }
            if (lro_unpack.containsKey(AppConst.DATA)) {
                Map<String, Object> object = (Map<String, Object>) lro_unpack.get(AppConst.DATA);
                tradeInfo.gets().putAll(object);
                _logger.debug("DATA=[{}]", object);
            } else {
                tradeInfo.gets().putAll(lro_unpack);
            }
        } catch (Exception e) {
            throw new RuntimeException(tradeInfo.tradeCode());
        }
        _logger.info("Success JsonDefaultUnpack.");
        return true;
    }

}
