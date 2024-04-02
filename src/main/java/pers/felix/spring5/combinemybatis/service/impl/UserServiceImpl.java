package pers.felix.spring5.combinemybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.felix.spring5.combinemybatis.dao.UserDao;
import pers.felix.spring5.combinemybatis.entity.User;
import pers.felix.spring5.combinemybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void findById(int id) {
        User user  = userDao.findById(id);
        System.out.println("id为" + id + "的用户姓名为：" + user.getName());
        System.out.println("id为" + id + "的用户年龄为：" + user.getAge());
    }
}
