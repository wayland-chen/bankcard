package com.offke.core.common.mgr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 * <p>spring 对象代理工厂</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class BeanProxy {
    private static final Logger _logger = LoggerFactory.getLogger(BeanProxy.class);
    private static ApplicationContext applicationContext;

    private BeanProxy() {
    }

    public static void instance(ApplicationContext applicationContext) {
        if (BeanProxy.applicationContext == null) {
            BeanProxy.applicationContext = applicationContext;
        }
    }

    public static <T> T lookupBean(Class<T> clazz) {
        T lro_bean = null;
        try {
            lro_bean = BeanProxy.applicationContext.getBean(clazz);
        } catch (Exception e) {
            _logger.error("Exception=[{}]", e);
            return null;
        }

        return lro_bean;
    }

    public static <T> T lookupBean(Class<T> clazz, String beanName) {
        T lro_bean = null;
        try {
            lro_bean = BeanProxy.applicationContext.getBean(beanName, clazz);
        } catch (Exception e) {
            _logger.error("Exception=[{}]", e);
            return null;
        }

        return lro_bean;
    }

    @SuppressWarnings("unchecked")
    public static <T> T lookupBean(String beanName) {
        T lro_bean = null;
        try {
            lro_bean = (T) BeanProxy.applicationContext.getBean(beanName);
        } catch (Exception e) {
            _logger.error("Exception=[{}]", e);
            return null;
        }

        return lro_bean;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
