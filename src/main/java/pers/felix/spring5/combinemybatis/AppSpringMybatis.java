package pers.felix.spring5.combinemybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.felix.spring5.combinemybatis.service.UserService;

import java.sql.SQLException;

public class AppSpringMybatis {
    public static void main(String[] args) throws SQLException {
        //获取配置类初始化容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从容器中获取UserService对象
        UserService userService = context.getBean(UserService.class);
        //调用service的方法
        userService.findById(3);
    }
}
