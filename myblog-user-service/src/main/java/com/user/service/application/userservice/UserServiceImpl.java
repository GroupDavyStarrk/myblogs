package com.user.service.application.userservice;

import com.starrk.dev.pojo.User;
import com.user.service.application.userdao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
@MapperScan("com.user.service.application.userdao")
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserDao userDao;

    @Override
    public String test() throws Exception{
        Thread.sleep(1000);
        return "abcd";
    }

    @Override
    public String hello() {
        return "123";
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
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
