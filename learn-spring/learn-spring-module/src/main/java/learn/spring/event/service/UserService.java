package learn.spring.event.service;

import learn.spring.event.event.async.event.UserAsyncRegisterEvent;
import learn.spring.event.event.syn.event.UserSyncRegisterEvent;
import learn.spring.event.model.UserBean;
import learn.spring.event.event.random.event.UserRandomRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 用户注册方法
     * @param user
     */
    public void asynRegister(UserBean user)  {

        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserAsyncRegisterEvent(this,user));
    }

    public void randomRegister(UserBean user)  {

        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserRandomRegisterEvent(this,user));
    }

    public void synRegister(UserBean user)  {

        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserSyncRegisterEvent(this,user));
    }


}
