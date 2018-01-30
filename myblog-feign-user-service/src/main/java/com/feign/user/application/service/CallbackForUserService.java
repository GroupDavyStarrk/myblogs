package com.feign.user.application.service;

import com.starrk.dev.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;


@Component
public class CallbackForUserService implements UserService {
    @Override
    public String test() {
        return "time out Callback";
    }

    @Override
    public String hello() {
        return "Callback hello";
    }

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("starrrrrrrk");
        user.setPassword("123456");
        user.setCreateTime(new Date(System.currentTimeMillis()));
        user.setEditTime(new Date(System.currentTimeMillis()));
        return user;
    }

    @Override
    public User findUserByUsername(String username) {
        User user = new User();
        user.setId(123);
        user.setUsername(username);
        user.setPassword("123456");
        user.setCreateTime(new Date(System.currentTimeMillis()));
        user.setEditTime(new Date(System.currentTimeMillis()));
        return user;
    }

    @Override
    public User findUserByUsernamePassword(String username,String password) {
        return null;
    }
}
