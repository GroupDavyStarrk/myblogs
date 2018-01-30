package com.feign.user.application.web;

import com.feign.user.application.service.UserService;
import com.netflix.hystrix.HystrixCircuitBreaker;
import com.netflix.hystrix.HystrixCommandKey;
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
//    @SuppressWarnings("unchecked")
    private UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String doTest() throws Exception{
        String result = userService.test();
        HystrixCircuitBreaker breaker = HystrixCircuitBreaker.Factory.
                getInstance(HystrixCommandKey.Factory.asKey("UserService#test()"));
        System.out.println("断路器状态: "+breaker.isOpen());
        return result;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        String a = userService.hello();
        System.out.println("sss"+a);
        return a;
    }
    @RequestMapping(value = "/byid/{id}",method = RequestMethod.GET)
    public User findUserByid(@PathVariable(name = "id") Integer id){
       return userService.findUserById(id);
    }
    @RequestMapping(value = "/byusername/{username}",method = RequestMethod.GET)
    public User findUserByUsername(@PathVariable(name = "username") String username){
        return userService.findUserByUsername(username);
    }
    @RequestMapping(value = "/byuser/{username}/{password}",method = RequestMethod.GET)
    public User findUserByUsernamePassword(@PathVariable(name = "username") String username,@PathVariable(name = "password") String password){
        return userService.findUserByUsernamePassword(username,password);
    }
}
