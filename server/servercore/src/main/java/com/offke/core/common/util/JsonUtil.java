package com.offke.core.common.util;

import com.offke.core.messages.json.JsonArray;
import com.offke.core.messages.json.JsonException;
import com.offke.core.messages.json.JsonObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p>json工具类</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class JsonUtil {

    /**
     * json(map)转json字符串
     *
     * @param msg 数据
     * @return json串
     */
    public static String map2sjson(Map<String, Object> msg) {
        JsonObject rets = new JsonObject();
        Object object;
        try {
            for (Map.Entry<String, Object> entry : msg.entrySet()) {
                if (entry.getValue() == null) {
                    rets.put(entry.getKey(), JsonObject.NULL);
                } else if ((object = entry.getValue()) instanceof Character) {
                    rets.put(entry.getKey(), (Character) object);
                } else if ((object = entry.getValue()) instanceof String) {
                    rets.put(entry.getKey(), (String) object);
                } else if (object instanceof StringBuffer || object instanceof StringBuilder) {
                    rets.put(entry.getKey(), object.toString());
                } else if (object instanceof Number) {
                    rets.put(entry.getKey(), String.valueOf(object));
                } else if (object instanceof List) {
                    List<Object> list = (List) object;
                    JsonArray array = new JsonArray();
                    toJsonArray(list, array);
                    rets.put(entry.getKey(), array);
                } else if (object instanceof Object[]) {
                    Object[] list = (Object[]) object;
                    JsonArray array = new JsonArray();
                    toJsonArray(list, array);
                    rets.put(entry.getKey(), array);
                } else if (object instanceof Map) {
                    Map map = (Map) object;
                    JsonObject jsonobject = new JsonObject();
                    toJsonObject(map, jsonobject);
                    rets.put(entry.getKey(), jsonobject);
                } else if (object instanceof JsonArray) {
                    rets.put(entry.getKey(), object);
                } else if (object instanceof JsonObject) {
                    rets.put(entry.getKey(), object);
                } else if (object instanceof Object) {
                    JsonObject jsonobject = toJsonObject(object);
                    if (jsonobject != null)
                        rets.put(entry.getKey(), jsonobject);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return rets.toString();
    }

    private static void toJsonArray(List<Object> list, JsonArray array) throws JsonException {
        for (Object object : list) {
            if (object == null) {
                array.put(JsonObject.NULL);
            } else if (object instanceof Character) {
                array.put((Character) object);
            } else if (object instanceof String) {
                array.put((String) object);
            } else if (object instanceof Number) {
                array.put(String.valueOf(object));
            } else if (object instanceof List) {
                List<Object> sublist = (List) object;
                JsonArray subarray = new JsonArray();
                toJsonArray(sublist, subarray);
                array.put(subarray);
            } else if (object instanceof Object[]) {
                Object[] list2 = (Object[]) object;
                JsonArray array2 = new JsonArray();
                toJsonArray(list2, array2);
                array.put(array2);
            } else if (object instanceof Map) {
                Map map = (Map) object;
                JsonObject jsonobject = new JsonObject();
                toJsonObject(map, jsonobject);
                array.put(jsonobject);
            } else if (object instanceof Object) {
                JsonObject jsonobject = toJsonObject(object);
                if (jsonobject != null)
                    array.put(jsonobject);
            }
        }
    }

    private static void toJsonArray(Object[] list, JsonArray array) throws JsonException {
        for (Object object : list) {
            if (object == null) {
                array.put(JsonObject.NULL);
            } else if (object instanceof Boolean) {
                array.put(object);
            } else if (object instanceof Character) {
                array.put((Character) object);
            } else if (object instanceof String) {
                array.put((String) object);
            } else if (object instanceof Number) {
                array.put(String.valueOf(object));
            } else if (object instanceof List) {
                List<Object> sublist = (List) object;
                JsonArray subarray = new JsonArray();
                toJsonArray(sublist, array);
                array.put(subarray);
            } else if (object instanceof Object[]) {
                Object[] list2 = (Object[]) object;
                JsonArray array2 = new JsonArray();
                toJsonArray(list2, array2);
                array.put(array2);
            } else if (object instanceof Map) {
                Map map = (Map) object;
                JsonObject jsonobject = new JsonObject();
                toJsonObject(map, jsonobject);
                array.put(jsonobject);
            } else if (object instanceof Object) {
                JsonObject jsonobject = toJsonObject(object);
                if (jsonobject != null)
                    array.put(jsonobject);
            }
        }
    }

    private static void toJsonObject(Map<String, Object> map, JsonObject jsonObject) throws JsonException {
        Object object;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                jsonObject.put(entry.getKey(), JsonObject.NULL);
            } else if ((object = entry.getValue()) instanceof Boolean) {
                jsonObject.put(entry.getKey(), entry.getValue());
            } else if ((object = entry.getValue()) instanceof Character) {
                jsonObject.put(entry.getKey(), (Character) object);
            } else if ((object = entry.getValue()) instanceof String) {
                jsonObject.put(entry.getKey(), (String) object);
            } else if ((object = entry.getValue()) instanceof Number) {
                jsonObject.put(entry.getKey(), String.valueOf(object));
            } else if ((object = entry.getValue()) instanceof List) {
                List<Object> list = (List) object;
                JsonArray array = new JsonArray();
                toJsonArray(list, array);
                jsonObject.put(entry.getKey(), array);
            } else if (object instanceof Object[]) {
                Object[] list2 = (Object[]) object;
                JsonArray array2 = new JsonArray();
                toJsonArray(list2, array2);
                jsonObject.put(entry.getKey(), array2);
            } else if ((object = entry.getValue()) instanceof Map) {
                Map submap = (Map) object;
                JsonObject subjsonobject = new JsonObject();
                toJsonObject(submap, subjsonobject);
                jsonObject.put(entry.getKey(), subjsonobject);
            } else if ((object = entry.getValue()) instanceof Object) {
                JsonObject subjsonobject = toJsonObject(object);
                if (subjsonobject != null)
                    jsonObject.put(entry.getKey(), subjsonobject);
            } else if (object instanceof JsonObject) {
                jsonObject.put(entry.getKey(), object);
            }
        }
    }

    private static JsonObject toJsonObject(Object object) {
        try {
            return new JsonObject(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * json串转java内部对象
     *
     * @param sjson   json串
     * @param mresult 返回值
     */
    public static void strToObject(String sjson, Map<String, Object> mresult) {
        try {
            JsonObject icbcprocessObj = new JsonObject(sjson);
            Object obj, key;
            List<Object> list;

            Iterator<?> keys = icbcprocessObj.sortedKeys();
            while (keys.hasNext()) {
                key = keys.next();
                if (key != null) {
                    obj = icbcprocessObj.get(key.toString());
                    if (obj != null && obj.equals(JsonObject.NULL)) {
                        mresult.put((String) key, null);
                    } else if (obj instanceof Number) {
                        mresult.put((String) key, obj);
                    } else if (obj instanceof String) {
                        mresult.put((String) key, obj);
                    } else if (obj instanceof JsonArray) {
                        JsonArray array = (JsonArray) obj;
                        list = new java.util.ArrayList<Object>(array.length());
                        toList(list, array);
                        mresult.put((String) key, list);
                    } else if (obj instanceof JsonObject) {
                        JsonObject jsonObject = (JsonObject) obj;
                        Map<String, Object> map = new HashMap<String, Object>(jsonObject.length());
                        toMap(map, jsonObject);
                        mresult.put((String) key, map);
                    }
                }
            }

        } catch (JsonException e) {
            throw new RuntimeException(e);
        }
    }

    private static void toMap(Map<String, Object> map, JsonObject jsonObject) throws JsonException {
        Iterator<?> keys = jsonObject.sortedKeys();
        while (keys.hasNext()) {
            Object key = keys.next();
            if (key != null) {
                Object object = jsonObject.get((String) key);
                if (object != null && object.equals(JsonObject.NULL)) {
                    map.put((String) key, null);
                } else if (object instanceof Number) {
                    map.put((String) key, object);
                } else if (object instanceof String) {
                    map.put((String) key, object);
                } else if (object instanceof JsonArray) {
                    JsonArray array = (JsonArray) object;
                    List<Object> list = new java.util.ArrayList<Object>(array.length());
                    toList(list, array);
                    map.put((String) key, list);
                } else if (object instanceof JsonObject) {
                    JsonObject tmpjsonObject = (JsonObject) object;
                    HashMap<String, Object> submap = new HashMap<String, Object>();
                    toMap(submap, tmpjsonObject);
                    map.put((String) key, submap);
                } else {
                    map.put((String) key, object);
                }
            }
        }
    }

    private static void toList(List<Object> list, JsonArray array) throws JsonException {
        for (int i = 0, len = array.length(); i < len; i++) {
            Object object = array.get(i);

            if (object != null && object.equals(JsonObject.NULL)) {
                list.add(null);
            } else if (object instanceof Number) {
                list.add(object);
            } else if (object instanceof String) {
                list.add(object);
            } else if (object instanceof JsonObject) {
                JsonObject tmpjsonObject = (JsonObject) object;
                Map<String, Object> map = new HashMap<String, Object>(tmpjsonObject.length());
                toMap(map, tmpjsonObject);
                list.add(map);
            } else if (object instanceof JsonArray) {
                JsonArray subarray = (JsonArray) object;
                List<Object> sublist = new java.util.ArrayList<Object>(array.length());
                toList(sublist, subarray);
                list.add(sublist);
            } else {
                list.add(object);
            }
        }
    }
}
