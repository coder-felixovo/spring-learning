package pers.felix.spring5.beaninstance.factory;

import org.springframework.beans.factory.FactoryBean;
import pers.felix.spring5.beaninstance.dao.UserDao;
import pers.felix.spring5.beaninstance.dao.impl.UserDaoImpl;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    // 代替实例工厂中创建对象
    @Override
    public UserDao getObject() throws Exception {
        System.out.println("FactoryBean实例化Bean");
        return new UserDaoImpl();
    }

    // 返回所创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // Bean作用域，默认true表示单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
