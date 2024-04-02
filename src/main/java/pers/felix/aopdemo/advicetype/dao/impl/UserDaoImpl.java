package pers.felix.aopdemo.advicetype.dao.impl;

import org.springframework.stereotype.Repository;
import pers.felix.aopdemo.advicetype.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Execute UserDao's save method");
//        int i = 1 / 0;
    }
    @Override
    public int update() {
        System.out.println("Execute UserDao's update method");
        return 1;
    }
}