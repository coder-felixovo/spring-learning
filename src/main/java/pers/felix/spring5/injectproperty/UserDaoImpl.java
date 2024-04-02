package pers.felix.spring5.injectproperty;

import pers.felix.spring5.injectproperty.UserDao;

/**
 * @author felixovo
 * @date 2023-06-07 16:44:08
 * @description
 */
public class UserDaoImpl implements UserDao {
    public void update() {
        System.out.println("UserDaoImpl update() ...");
    }
}
