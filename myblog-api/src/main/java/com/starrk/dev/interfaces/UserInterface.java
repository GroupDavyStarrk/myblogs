package com.starrk.dev.interfaces;

import com.starrk.dev.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/recall")
public interface UserInterface {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
    @RequestMapping(value = "/byid",method = RequestMethod.GET)
    public User findUserById(@RequestParam("id") Integer id);
    @RequestMapping(value = "/byusername/{username}",method = RequestMethod.GET)
    public User findUserByUsername(@PathVariable(name = "username") String username);
    @RequestMapping(value = "/byuser/{username}/{password}",method = RequestMethod.GET)
    public User findUserByUsernamePassword(@PathVariable(name = "username") String username, @PathVariable(name = "password") String password);
}
