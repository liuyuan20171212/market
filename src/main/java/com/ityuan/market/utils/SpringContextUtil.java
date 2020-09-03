package com.ityuan.market.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author: ityuan
 */
public class SpringContextUtil implements Serializable {
    private SpringContextUtil() {
    }

    /**
     * Spring应用上下文环境
     */
    private static ApplicationContext applicationContext;


    public static void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }


    @SuppressWarnings("unchecked")
    public static <T> T getBeanByName(String name) throws BeansException {
        return applicationContext == null ? null : (T) applicationContext.getBean(name);
    }

    public static <T> T getBean(String name, Class<T> T) throws BeansException {
        return applicationContext == null ? null : applicationContext.getBean(name, T);
    }

    public static <T> T getBeanByClass(Class<T> T) throws BeansException {
        return applicationContext == null ? null : applicationContext.getBean(T);
    }

    public static <T> Map<String, T> getBeansOfType(Class<T> clazz) {
        @SuppressWarnings("rawtypes")
        Map<String, T> beanMaps = applicationContext.getBeansOfType(clazz);
        if (beanMaps != null && !beanMaps.isEmpty()) {
            return beanMaps;
        } else {
            return null;
        }
    }
}
