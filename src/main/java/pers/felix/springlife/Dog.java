package pers.felix.springlife;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements BeanNameAware, InitializingBean, DisposableBean {
    private String name;

    public Dog() {
        System.out.println("无参构造 实例化");
    }

    public Dog(String name) {
        System.out.println("有参构造 实例化");
        this.name = name;
    }

    public void setName(String name) {
        System.out.println("依赖注入");
        this.name = name;
    }

    public void myInit() {
        System.out.println("初始化");
    }

    public void myDestroy() {
        System.out.println("销毁");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("正在执行 BeanNameAware接口 定义的 setBeanName()方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行 InitializingBean接口 定义的 afterPropertiesSet()方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行 DisposableBean接口 定义的 destroy()方法");
    }
}
