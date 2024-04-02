package pers.felix.aopdemo.datafromadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.felix.aopdemo.datafromadvice.service.UserService;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        // 获取配置类初始化容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从容器中获取UserService对象
        UserService UserService = context.getBean(UserService.class);
        //调用UserService的方法
        String user = UserService.hello("Amy", 18);
        System.out.println(user);
    }
}

