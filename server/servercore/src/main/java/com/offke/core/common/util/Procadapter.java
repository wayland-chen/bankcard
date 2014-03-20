package com.offke.core.common.util;

import java.io.File;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 缓存适配器
 *
 * @version 1.0
 * @since 2012/5/17
 */
public class Procadapter extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * <p> 把数据暂存到gets中 </p>
     *
     * @param key   关键字
     * @param value 值
     * @return 值
     */
    public void get(String key, Object value) {
        this.put(key, value);
    }

    /**
     * 获取任意类型
     *
     * @param key            关键字
     * @param conversionType 目标类型
     * @return 值
     */
    public <T> T get(String key, Class<?> conversionType) {
        Object value = super.get(key);
        return (T) DataTransition.changeType(value, conversionType);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        Object obj = super.get(key);
        if (obj == null) {
            return null;
        }

        return (T) obj;
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Object getObject(String key) {
        return super.get(key);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public File getFile(String key) {
        Object obj = super.get(key);
        if (obj == null) {
            return null;
        } else {
            return TypeConver.getFile(obj);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public String getString(String key) {
        Object obj = super.get(key);
        if (obj == null) {
            return null;
        }

        return String.valueOf(obj);
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Float getFloat(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getFloat(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Double getDouble(String key) {

        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getDouble(value);
        }

    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public BigDecimal getBigDecimal(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getBigDecimal(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Map getMap(String key) {
        return TypeConver.getMap(super.get(key));
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Integer getInt(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getInt(value);
        }
    }

    /**
     * <p> 根据key获取到报文信息 </p>
     *
     * @param key 关键字
     * @return 返回的key的对象
     */
    public Long getLong(String key) {
        Object value = this.getObject(key);
        if (Validate.isEmpty(value)) {
            return null;
        } else {
            return TypeConver.getLong(value);
        }
    }

    public Procadapter wrap(String key) {
        Object object = this.get(key);
        if (object != null && !(object instanceof Procadapter)) {
            this.remove(key);
            object = new Procadapter();
            this.put(key, object);
        } else if (object == null) {
            object = new Procadapter();
            this.put(key, object);
        }

        return (Procadapter) object;
    }
}
