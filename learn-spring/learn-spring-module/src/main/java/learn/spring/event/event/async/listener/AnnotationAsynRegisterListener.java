package learn.spring.event.event.async.listener;

import learn.spring.event.event.async.event.UserAsyncRegisterEvent;

import learn.spring.event.model.UserBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationAsynRegisterListener {

    @EventListener
    public void register(UserAsyncRegisterEvent userRegisterEvent) {

        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("异步注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }

}
