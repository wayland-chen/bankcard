package com.offke.core.bu.struct.pojo;

import com.offke.core.common.util.ObjectMapper;

import java.util.Map;

public class ScqOpt {
    private Integer gcount;
    private Integer ghead;

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getGhead() {
        return ghead;
    }

    public void setGhead(Integer ghead) {
        this.ghead = ghead;
    }

    /**
     * map2opt
     *
     * @param opt 数据源
     * @return 结果
     * @throws Exception
     */
    public static ScqOpt map2opt(Map<String, Object> opt) throws Exception {
        if (opt == null) {
            return null;
        }
        ScqOpt scqopt = new ScqOpt();
        ObjectMapper.map2obj(opt, scqopt);
        return scqopt;
    }
}
