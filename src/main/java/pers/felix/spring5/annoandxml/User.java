package pers.felix.spring5.annoandxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 设置该类为Spring管理的Bean，替换XMl中的<bean>
// id可以不写，默认id为首字母小写的类名
// 不写@Scope默认为单例模式
@Component("user")
//@Scope("prototype") // 非单例
public class User {
    @Value("foo")
    private String name;

    @Value("18")
    private int age;

    public User() {
        System.out.println("注解开发，Bean实例化，无参构造方法");
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("注解开发，Bean初始化，执行Bean初始化回调方法");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("注解开发，Bean销毁，执行Bean销毁回调方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
