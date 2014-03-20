package com.offke.core.messages.pack;

import com.offke.core.AppConst;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.standard.interfaces.IPack;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>校园通缺省打包接口</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
@Component("jsondefaultpack")
public class JsonDefaultPack implements IPack {
    private static final Logger _logger = LoggerFactory.getLogger(JsonDefaultPack.class);

    public boolean handle(TradeInfo tradeInfo) {
        if (tradeInfo.isLog())
            _logger.info("Begin JsonDefaultPack...");
        /*  if ( !tradeInfo.puts( ).containsKey( TradeConst.tradecode ) )
        {
            tradeInfo.put( TradeConst.tradecode, tradeInfo.get(  TradeConst.tradecode  ) );
        }
        if ( tradeInfo.gets( ).containsKey(  TradeConst.tradeid  ) )
        {
            tradeInfo.put( TradeConst.traderef, tradeInfo.get(  TradeConst.tradeid  ) );
        }*/
        Map<String, Object> heads = new LinkedHashMap<String, Object>();
        heads.put(AppConst.traderef, tradeInfo.getTradeid());
        heads.put(AppConst.workdate, tradeInfo.getWorkdate());
        _logger.info("HEAD[{}]={}", AppConst.traderef, tradeInfo.getTradeid());
        _logger.info("HEAD[{}]={}", AppConst.workdate, tradeInfo.getWorkdate());

        Map<String, Object> body = new LinkedHashMap<String, Object>();
        for (Map.Entry<String, Object> entry : tradeInfo.puts().entrySet()) {
            body.put(entry.getKey(), entry.getValue());
            _logger.info("BODY【" + entry.getKey() + "=" + entry.getValue() + "】");
        }
        tradeInfo.puts().clear();
        tradeInfo.put(AppConst.HEAD, heads);
        tradeInfo.put(AppConst.BODY, body);

        String ret = JsonUtil.map2sjson(tradeInfo.puts());
        tradeInfo.sMsg(ret);

        if (tradeInfo.isLog())
            _logger.info("Success JsonDefaultPack.");
        return true;
    }
}
