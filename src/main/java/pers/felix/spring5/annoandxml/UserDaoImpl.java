package pers.felix.spring5.annoandxml;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("注解开发，这是UserDaoImpl的save方法");
    }
}
