package com.user.service.application.userdao;

import com.starrk.dev.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from user where id=#{id}")
    public User findUserById(@Param("id") Integer id);

    @Select("select * from user where username=#{username}")
    public User findUserByName(@Param("username") String username);

    @Select("select * from user where username=#{username} and password=#{password}")
    public User findUserByUsername(@Param("username") String username,@Param("password") String password);
}

