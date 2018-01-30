package com.starrk.dev.interfaces;

import com.starrk.dev.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping("/recall")
public interface UserInterface {
    @RequestMapping(value = "/recall/test",method = RequestMethod.GET)
    public String test()throws Exception;
    @RequestMapping(value = "/recall/hello",method = RequestMethod.GET)
    public String hello();
    @RequestMapping(value = "/recall/byid",method = RequestMethod.GET)
    public User findUserById(@RequestParam("id") Integer id);
    @RequestMapping(value = "/recall/byusername",method = RequestMethod.GET)
    public User findUserByUsername(@RequestParam("username") String username);
    @RequestMapping(value = "/recall/byuser",method = RequestMethod.GET)
    public User findUserByUsernamePassword(@RequestParam("username") String username, @RequestParam("password") String password);
}
