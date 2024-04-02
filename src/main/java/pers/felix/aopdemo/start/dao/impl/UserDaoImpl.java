package pers.felix.aopdemo.start.dao.impl;

import org.springframework.stereotype.Repository;
import pers.felix.aopdemo.start.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("执行UserDao的add方法");
    }

    @Override
    public void delete() {
        System.out.println("执行UserDao的delete方法");
    }

    @Override
    public void update() {
        System.out.println("执行UserDao的update方法");
    }

    @Override
    public void select() {
        System.out.println("执行UserDao的select方法");
    }
}
