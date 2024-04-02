package pers.felix.spring5.annoandxml;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    @Qualifier("userDao2")
//    private UserDao userDao2;

    @Resource(name = "userDao2", type = UserDaoImpl2.class)
    private UserDao userDao2;


    @Override
    public void save() {
        // userDao.save();
        userDao2.save();
        System.out.println("注解开发，这是UserServiceImpl的save方法");
    }
}
