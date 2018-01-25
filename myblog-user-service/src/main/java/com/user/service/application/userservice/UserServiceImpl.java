package com.user.service.application.userservice;

import com.starrk.dev.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public User findUserByUsernamePassword(String username, String password) {
        return null;
    }
}
