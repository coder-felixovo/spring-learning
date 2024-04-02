package pers.felix.spring5.combinemybatis.dao.impl;

import org.springframework.stereotype.Repository;
import pers.felix.spring5.combinemybatis.dao.UserDao;
import pers.felix.spring5.combinemybatis.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User findById(int id) {
        return null;
    }
}
