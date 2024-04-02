package pers.felix.spring5.beaninstance.dao.impl;

import pers.felix.spring5.beaninstance.dao.UserDao;

public class UserDaoImpl implements UserDao {

    /* 构造方法实例化Bean */

    // 运行App.main()，观察输出结果，说明Spring IoC容器创建对象使用的也是构造方法。
//    public UserDaoImpl() {
//        System.out.println("The public parameterless constructor of the class UserDaoImpl");
//    }

    // 运行App.main()，观察输出结果，说明Spring底层用的是反射，能够访问到类中的私有方法。
//    private  UserDaoImpl() {
//        System.out.println("The private parameterless constructor of the class UserDaoImpl");
//    }

    // 运行App.main()，报错，说明Spring使用的是类的无参构造方法
//    public UserDaoImpl(int i) {
//        System.out.println("The public parameter constructor of the class UserDaoImpl");
//    }

    /* 静态工厂实例化Bean */
    /* 实例工厂实例化Bean */
    /* FactoryBean实例化Bean */
    public UserDaoImpl() {
        System.out.println("类UserDaoImpl的无参构造方法");
    }

    @Override
    public void say() {
        System.out.println("Hello, I am Felix!");
    }
}
