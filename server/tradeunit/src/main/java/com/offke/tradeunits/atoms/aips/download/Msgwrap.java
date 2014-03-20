package com.offke.tradeunits.atoms.aips.download;

import com.offke.core.AppConst;
import com.offke.core.common.util.DataTransition;
import com.offke.core.common.util.Ids;
import com.offke.core.common.util.JsonUtil;
import com.offke.core.status.procedure.DateSource;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 生成请求子系统的报文包装器
 *
 * @version 1.0
 * @since 2012/5/22
 */
public class Msgwrap {

    /**
     * 获取报文指令头
     *
     * @param tradecode 交易码
     * @return map
     */
    public static Map<String, Object> getCmd(String tradecode) {
        Map<String, Object> cmd = new LinkedHashMap<String, Object>();
        cmd.put("tradecode", tradecode);
        cmd.put(AppConst.src, "splus-core");
        cmd.put(AppConst.des, "splus-aips");
        cmd.put(AppConst.tradeid, Ids.getTradeid());
        cmd.put(AppConst.workdate, DataTransition.dateToStr(DateSource.getSysdate(), AppConst.DatePattern1));

        return cmd;
    }

    public static void parseAips(String rmsg, Map<String, Object> result) {
        if (rmsg == null) {
            return;
        }
        Map<String, Object> unpack = new LinkedHashMap<String, Object>();
        JsonUtil.strToObject(rmsg, unpack);
        if (unpack.containsKey(AppConst.BODY)) {
            result.putAll(((Map<String, Object>) unpack.get(AppConst.BODY)));
        } else {
            result.putAll(unpack);
        }
    }
}
