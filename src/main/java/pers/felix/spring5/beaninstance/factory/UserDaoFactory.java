package pers.felix.spring5.beaninstance.factory;

import pers.felix.spring5.beaninstance.dao.UserDao;
import pers.felix.spring5.beaninstance.dao.impl.UserDaoImpl;

// 工厂类
public class UserDaoFactory {
    // 静态工厂创建对象
//    public static UserDao getUserDao() {
//        System.out.println("静态工厂实例化Bean");
//        return new UserDaoImpl();
//    }

    // 实例工厂创建对象
    public UserDao getUserDao() {
        System.out.println("实例工厂实例化Bean");
        return new UserDaoImpl();
    }
}
