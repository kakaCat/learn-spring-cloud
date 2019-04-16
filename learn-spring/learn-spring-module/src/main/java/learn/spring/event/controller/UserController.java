package learn.spring.event.controller;


import learn.spring.event.model.UserBean;
import learn.spring.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    //用户业务逻辑实现
    @Autowired
    private UserService userService;

    /**
     * 注册控制方法
     * @param user 用户对象
     * @return
     */
    @RequestMapping(value = "/register1")
    public String asynRegister(UserBean user){
        //调用注册业务逻辑
        userService.asynRegister(user);
        return "异步注册成功.";
    }

    @RequestMapping(value = "/register2")
    public String synRegister(UserBean user){
        //调用注册业务逻辑
        userService.synRegister(user);
        return "同步注册成功.";
    }

    @RequestMapping(value = "/register3")
    public String randomRegister(UserBean user){
        //调用注册业务逻辑
        userService.randomRegister(user);
        return "随机注册成功.";
    }

}
