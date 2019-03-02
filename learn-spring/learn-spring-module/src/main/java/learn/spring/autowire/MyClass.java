package learn.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

    private final MyBean myBean;

    @Autowired
    public MyClass(MyBean myBean) {
        this.myBean = myBean;
    }


}
