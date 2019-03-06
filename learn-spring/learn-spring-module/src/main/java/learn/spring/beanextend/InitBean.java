package learn.spring.beanextend;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.NamedBean;
import org.springframework.stereotype.Component;

@Component("initBean")
public class InitBean implements InitializingBean, DisposableBean,NamedBean{


    public String getBean(){

        return "initbean";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after");
    }


    @Override
    public String getBeanName() {
        return null;
    }
}
