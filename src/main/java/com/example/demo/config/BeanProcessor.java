package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;

/**
 * Spring的后置处理器
 * 可以在bean的初始化前后调用
 */
@Slf4j
public class BeanProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        log.info("初始化前置处理器: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        log.info("初始化后置处理器");
        return bean;
    }
}
