package pers.felix.spring5.annoandxml;

import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {
    @Override
    public void save() {
        System.out.println("注解开发，这是第二个dao实现类U色弱DaoImpl2的save方法");
    }
}
