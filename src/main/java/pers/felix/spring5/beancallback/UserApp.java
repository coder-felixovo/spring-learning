package pers.felix.spring5.beancallback;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
    public static void main(String[] args) {
        // 获取容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanCallback.xml");
        // 从容器中获取bean
        User user = context.getBean("user", User.class);
        // 使用bean
        System.out.println(user);
        // 关闭容器
        context.close();
    }
}
