//package com.user.service.application.userservice;
//
//import com.starrk.dev.pojo.User;
//import com.user.service.application.userdao.UserDao;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
////@RequestMapping("/recall")
//@MapperScan("com.user.service.application.userdao")
//public class UserServiceImpl2 {
//
//    @Autowired
//    private UserDao userDao;
//    @RequestMapping(value = "/recall/hello",method = RequestMethod.GET)
//    public String hello() {
//        return "123";
//    }
////    @RequestMapping(value = "/byid",method = RequestMethod.GET)
////    public User findUserById(@RequestParam("id")Integer id) {
////        return userDao.findUserById(id);
////        User user = new User();
////        user.setId(id);
////        user.setPassword("AAAA");
////        user.setUsername("bbbb");
////        user.setCreateTime(new Date(System.currentTimeMillis()));
////        user.setEditTime(new Date(System.currentTimeMillis()));
////        return user;
////    }
////    @RequestMapping(value = "/byusername",method = RequestMethod.GET)
////    public User findUserByUsername(@RequestParam("username") String username) {
////        return userDao.findUserByName(username);
////    }
////    @RequestMapping(value = "/byuser",method = RequestMethod.GET)
////    public User findUserByUsernamePassword(@RequestParam("username") String username,@RequestParam("password") String password) {
////        return userDao.findUserByUsername(username,password);
////    }
//}
