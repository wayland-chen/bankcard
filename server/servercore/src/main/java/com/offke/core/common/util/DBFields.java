package com.offke.core.common.util;

import com.offke.core.AppConst;
import com.offke.core.common.mgr.SplusConfigPath;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>查询中文字段</p>
 *
 * @version 1.0
 * @since 2012/04/28
 */
public class DBFields {
    private static DBFields self;
    private Map<String, Map<String, String>> tableAfields = new HashMap<String, Map<String, String>>();

    private DBFields() {
    }

    public static DBFields instance() {
        if (self == null) {
            self = new DBFields();
        }

        return self;
    }

    public void init() throws IOException {
        tableAfields.clear();
        List<String> lines =
                FileUtils.readLines(new File(SplusConfigPath.instance().getConfigPath()
                        + "/fields_zh_CN.properties"), AppConst.charsetName);
        for (String item : lines) {
            String[] split = item.split("=");
            if (split.length == 2) {
                int of = split[0].indexOf('.');
                if (of != -1 && split[0].length() - 1 != of) {
                    putField(split[0].substring(0, of).trim(), split[0].substring(of + 1, split[0].length()).trim(), split[1].trim());
                }
            }
        }
    }

    private void putField(String table, String field, String cn) {
        Map<String, String> map = tableAfields.get(table);
        if (map == null) {
            map = new HashMap<String, String>();
            tableAfields.put(table, map);
        }
        map.put(field, cn);
    }

    public Map<String, String> getFields(String... tables) {
        if (tables == null) {
            return null;
        } else {
            if (tables.length == 1) {
                return tableAfields.get(tables[0].toUpperCase());
            } else {
                Map<String, String> ret = new HashMap<String, String>();
                for (String tableName : tables) {
                    Map<String, String> tfs = tableAfields.get(tableName.toUpperCase());
                    if (tfs != null) {
                        ret.putAll(tfs);
                    }
                }
                return ret;
            }
        }
    }

}
