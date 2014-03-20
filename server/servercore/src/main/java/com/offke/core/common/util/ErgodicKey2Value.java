package com.offke.core.common.util;

import com.offke.core.bu.struct.pojo.Value;

import java.util.Collection;
import java.util.Map;

/**
 * <p>遍历任何层次的keyvalue</p>
 *
 * @version 1.0
 * @since 2012/4/27
 */
public class ErgodicKey2Value {
    /**
     * <p>依据key取value</p>
     *
     * @param map map
     * @param key key
     * @return 结果
     */
    public static void get(Map map, String key, Value pValue) {
        if (pValue != null && pValue.getValue() != null) {
            return;
        }

        if (map != null) {
            if (map.containsKey(key)) {
                pValue.setValue(map.get(key));
            } else {
                Collection values = map.values();
                for (Object value : values) {
                    if (value instanceof Map) {
                        if (((Map) value).containsKey(key)) {
                            pValue.setValue(((Map) value).get(key));
                        } else {
                            get((Map) value, key, pValue);
                        }
                    }
                }
            }
        }
    }
}
