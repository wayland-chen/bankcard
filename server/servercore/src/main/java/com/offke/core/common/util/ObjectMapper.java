/*
 * ObjectMapper.java  v1.00  2011-12-6
 * Peoject	smartcard-simple
 * Copyright (c) 2011 Wisdragon
 *
 * Filename	:	ObjectMapper.java  v1.00 2011-12-6
 * Project	: 	smartcard-simple
 * Copyight	:	Copyright (c) 2011 Wisdragon
 */
package com.offke.core.common.util;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;

import java.lang.reflect.Method;
import java.util.*;
import java.util.Map.Entry;

/**
 * 对象转换工具类. 1.封装Dozer, 深度转换对象到对象 2.封装Apache Commons BeanUtils, 将字符串转换为对象.
 *
 * @author <a href="mailto:jianggl88@gmail.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2011-12-6
 */
public abstract class ObjectMapper {

    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    private static DozerBeanMapper dozer;

    static {
        // 初始化日期格式为yyyy-MM-dd 或 yyyy-MM-dd HH:mm:ss
        registerDateConverter("yyyy-MM-dd,yyyy-MM-dd HH:mm:ss");
        dozer = new DozerBeanMapper();
    }

    /**
     * 基于Dozer转换对象的类型.
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        return dozer.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<T>();
        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }


    /**
     * 定义Apache BeanUtils日期Converter的格式,可注册多个格式,以','分隔
     */
    public static void registerDateConverter(String patterns) {
        DateConverter dc = new DateConverter();
        dc.setUseLocaleFormat(true);
        dc.setPatterns(StringUtils.split(patterns, ","));
        ConvertUtils.register(dc, Date.class);
    }

    /**
     * map  to obj ，更新方式
     *
     * @param map    哈希表
     * @param desObj 目标对象
     * @throws Exception 异常
     */
    public static void map2obj(Map map, Object desObj) throws Exception {
        Method[] tmp = desObj.getClass().getMethods();
        Map<String, Method> methods = new HashMap<String, Method>();
        Map<Method, Class> params = new HashMap<Method, Class>();
        for (int i = 0; i < tmp.length; i++) {
            Class<?>[] types = tmp[i].getParameterTypes();
            if (types != null && types.length == 1) {
                methods.put(tmp[i].getName().toLowerCase().replace("set", ""), tmp[i]);
                params.put(tmp[i], types[0]);
            }
        }

        Set<Entry<?, ?>> entrySet = map.entrySet();
        for (Entry<?, ?> entry : entrySet) {
            Method method = methods.get(entry.getKey().toString().toLowerCase());
            if (method != null) {
                method.invoke(desObj, new Object[]{DataTransition.changeType(entry.getValue(), params.get(method))});
            }

        }


    }

}
