package learn.spring.event.event.async.listener;

import learn.spring.event.event.async.event.UserAsyncRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterAsynEmailListener {
    /**
     * 发送邮件监听实现
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendMail(UserAsyncRegisterEvent userRegisterEvent)
    {
        System.out.println("异步用户注册成功，发送邮件。");
    }

}
