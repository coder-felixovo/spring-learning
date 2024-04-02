package pers.felix.spring5.pureanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // 获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 获取对象
        User user = context.getBean(User.class);
        // 使用bean
        System.out.println(user);
    }
}
