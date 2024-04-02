package pers.felix.spring5.combinemybatis.dao;

import org.apache.ibatis.annotations.Select;
import pers.felix.spring5.combinemybatis.entity.User;

public interface UserDao {
    @Select("select * from user where id = #{id}")
    User findById(int id);
}
