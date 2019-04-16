package learn.spring.event.event.random.listener;

import learn.spring.event.event.random.event.UserRandomRegisterEvent;
import learn.spring.event.event.syn.event.UserSyncRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterRandomEmailListener {
    /**
     * 发送邮件监听实现
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendMail(UserRandomRegisterEvent userRegisterEvent)
    {
        System.out.println("随机用户注册成功，发送邮件。");
    }

}
