package com.offke.core.bu.util;

import com.offke.core.bu.struct.pojo.SimplePage;
import com.offke.core.common.util.ObjectMapper;
import com.offke.core.status.procedure.TradeInfo;

import java.util.Map;

/**
 * Page映射处理
 *
 * @version 1.0
 * @since 2012/12/09
 */
public class PageUtil {
    public static SimplePage toSimplePage(TradeInfo tradeInfo) {
        SimplePage sp = new SimplePage();
        sp.setPageNo((Integer) tradeInfo.getErgodicity("pageNo", Integer.class));
        sp.setPageSize((Integer) tradeInfo.getErgodicity("pageSize", Integer.class));

        return sp;
    }

    public static SimplePage toSimplePage(Map map) throws Exception {
        SimplePage sp = new SimplePage();
        ObjectMapper.map2obj(map, sp);
        return sp;
    }
}
