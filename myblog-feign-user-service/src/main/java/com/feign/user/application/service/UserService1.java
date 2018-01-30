package com.feign.user.application.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "USER-SERVICE",fallback = CallbackForUserService.class)
//@RequestMapping("/recall")
//public interface UserService1 {
//    @RequestMapping(value = "/recall/hello",method = RequestMethod.GET)
//    public String hello();
//    @RequestMapping(value = "/byid",method = RequestMethod.GET)
//    public User findUserById(@RequestParam("id") Integer id);
//    @RequestMapping(value = "/byusername",method = RequestMethod.GET)
//    public User findUserByUsername(@RequestParam("username") String username);
//    @RequestMapping(value = "/byuser",method = RequestMethod.GET)
//    public User findUserByUsernamePassword(@RequestParam("username") String username, @RequestParam("password") String password);

//}
