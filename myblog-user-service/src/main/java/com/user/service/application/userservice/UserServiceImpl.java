package com.user.service.application.userservice;

import com.starrk.dev.pojo.User;
import com.user.service.application.userdao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@MapperScan("com.user.service.application.userdao")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String hello() {
        return "123";
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
//        User user = new User();
//        user.setId(id);
//        user.setPassword("AAAA");
//        user.setUsername("bbbb");
//        user.setCreateTime(new Date(System.currentTimeMillis()));
//        user.setEditTime(new Date(System.currentTimeMillis()));
//        return user;
    }

    @Override
    public User findUserByUsername(String username) {
        return userDao.findUserByName(username);
    }

    @Override
    public User findUserByUsernamePassword(String username, String password) {
        return userDao.findUserByUsername(username,password);
    }
}
