package pers.felix.aopdemo.datafromadvice.service.impl;

import org.springframework.stereotype.Repository;
import pers.felix.aopdemo.datafromadvice.service.UserService;

@Repository
public class UserServiceImpl implements UserService {

    @Override
    public String hello(String name, int age) {
        return "name:" + name + ", age:" + age;
    }
}
