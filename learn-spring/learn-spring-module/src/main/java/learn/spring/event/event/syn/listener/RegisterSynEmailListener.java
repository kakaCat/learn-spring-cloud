package learn.spring.event.event.syn.listener;

import learn.spring.event.event.async.event.UserAsyncRegisterEvent;
import learn.spring.event.event.syn.event.UserSyncRegisterEvent;
import learn.spring.event.model.UserBean;
import learn.spring.event.service.UserService;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterSynEmailListener implements SmartApplicationListener {
    /**
     *  该方法返回true&supportsSourceType同样返回true时，才会调用该监听内的onApplicationEvent方法
     * @param aClass 接收到的监听事件类型
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        //只有UserRegisterEvent监听类型才会执行下面逻辑
        return aClass == UserSyncRegisterEvent.class;
    }

    /**
     *  该方法返回true&supportsEventType同样返回true时，才会调用该监听内的onApplicationEvent方法
     * @param aClass
     * @return
     */
    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        //只有在UserService内发布的UserRegisterEvent事件时才会执行下面逻辑
        return aClass == UserService.class;
    }

    /**
     *  supportsEventType & supportsSourceType 两个方法返回true时调用该方法执行业务逻辑
     * @param applicationEvent 具体监听实例，这里是UserRegisterEvent
     */
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        System.out.println("同步用户注册成功，发送邮件。");
    }

    /**
     * 同步情况下监听执行的顺序
     * @return 数值越小证明优先级越高，执行顺序越靠前
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
