package pers.felix.spring5.beaninstance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.felix.spring5.beaninstance.dao.impl.UserDaoImpl;

public class App {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beaninstance.xml");
        // 从容器中获取对象
//        UserDaoImpl userDao = context.getBean("userDao", UserDaoImpl.class);
//        userDao.say();

        // FactoryBean实例化Bean 单例
        UserDaoImpl userDao1 = context.getBean("userDao", UserDaoImpl.class);
        UserDaoImpl userDao2 = context.getBean("userDao", UserDaoImpl.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        System.out.println(userDao1 == userDao2);
    }
}
