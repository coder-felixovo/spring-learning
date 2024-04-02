package pers.felix.aopdemo.advicetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.felix.aopdemo.advicetype.dao.UserDao;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        // 获取配置类初始化容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从 容器中获取UserDao对象
        UserDao userDao = context.getBean(UserDao.class);
        // 调用userDao的方法
//        userDao.save();
        userDao.update();
    }
}

