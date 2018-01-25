package com.feign.user.application.web;

import com.feign.user.application.service.UserService;
import com.feign.user.application.service.Useraaa;
import com.starrk.dev.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Useraaa useraaa;

    @RequestMapping(value = "/byid/{id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable Integer id){
       return userService.findUserById(id);
    }
    @RequestMapping(value = "/byusername/{username}",method = RequestMethod.GET)
    public User findUserByUsername(@PathVariable String username){
        return userService.findUserByUsername(username);
    }
    @RequestMapping(value = "/byuser/{username}/{password}",method = RequestMethod.GET)
    public User findUserByUsernamePassword(@PathVariable(name = "username") String username,@PathVariable(name = "password") String password){
        return userService.findUserByUsernamePassword(username,password);
    }
}
