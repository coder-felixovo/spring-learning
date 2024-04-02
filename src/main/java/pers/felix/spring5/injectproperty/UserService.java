package pers.felix.spring5.injectproperty;

import pers.felix.spring5.injectproperty.UserDao;

/**
 * @author felixovo
 * @date 2023-06-07 16:42:34
 * @description
 */
public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add() {
        System.out.println("UserService add() ...");
        userDao.update();
    }
}
