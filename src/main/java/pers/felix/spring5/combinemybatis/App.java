package pers.felix.spring5.combinemybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.felix.spring5.combinemybatis.dao.UserDao;
import pers.felix.spring5.combinemybatis.entity.User;


import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
        // 1.加载mybatis的核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.获取userMapper接口的代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        // 5.执行查询，获取结果User
        User user = userDao.findById(1);
        System.out.println(user);
        // 6. 释放资源
        sqlSession.close();
    }
}
