package learn.spring.event.event.async.event;

import learn.spring.event.model.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserAsyncRegisterEvent extends ApplicationEvent {

    //注册用户对象
    private UserBean user;

    /**
     * 重写构造函数
     * @param source 发生事件的对象
     * @param user 注册用户对象
     */
    public UserAsyncRegisterEvent(Object source,UserBean user) {
        super(source);
        this.user = user;
    }


}

