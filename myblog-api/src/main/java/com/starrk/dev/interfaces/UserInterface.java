package com.starrk.dev.interfaces;

import com.starrk.dev.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
public interface UserInterface {
    @RequestMapping(value = "/byid/{id}",method = RequestMethod.GET)
    public User findUserById(Integer id);
    @RequestMapping(value = "/byusername/{username}",method = RequestMethod.GET)
    public User findUserByUsername(String username);
    @RequestMapping(value = "/byuser/{username}/{password}",method = RequestMethod.GET)
    public User findUserByUsernamePassword(String username,String password);
}
