package learn.spring.event.event.random.listener;

import learn.spring.event.event.async.event.UserAsyncRegisterEvent;
import learn.spring.event.event.random.event.UserRandomRegisterEvent;
import learn.spring.event.model.UserBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationRandomRegisterListener {

    @EventListener
    public void register(UserRandomRegisterEvent userRegisterEvent) {

        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("random注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }

}
