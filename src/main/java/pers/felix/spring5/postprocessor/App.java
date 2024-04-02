package pers.felix.spring5.postprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 获取容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
        // 获取bean
        User user  = context.getBean("user", User.class);
        // 使用bean
        System.out.println("使用Bean：" + user);
        // 关闭容器
        context.close();
    }
}
