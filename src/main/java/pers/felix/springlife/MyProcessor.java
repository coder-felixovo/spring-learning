package pers.felix.springlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("dog".equals(beanName)) {
            System.out.println("初始化前 正在执行 BeanPostProcessor接口 定义的 postProcessBeforeInitialization()方法");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("dog".equals(beanName)) {
            System.out.println("初始化后 正在执行 BeanPostProcessor接口 定义的 postProcessAfterInitialization()方法");
        }
        return bean;
    }
}
