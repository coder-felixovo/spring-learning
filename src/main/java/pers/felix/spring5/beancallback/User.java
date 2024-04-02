package pers.felix.spring5.beancallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("这是Bean的销毁回调方法 --- 通过实现接口设置");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是Bean的初始化回调方法 --- 通过实现接口设置");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
