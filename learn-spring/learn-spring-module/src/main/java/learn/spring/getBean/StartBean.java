package learn.spring.getBean;

import learn.spring.annotation.AnnUser;
import learn.spring.annotation.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName StartBean
 * @Description bean
 * @Author yunp
 * @Date 2020/4/16 10:53
 * @Version 1.0
 **/
public class StartBean {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AnnUser annUser = (AnnUser)ctx.getBean("annUser");
        System.out.println(annUser.getHello());

        ctx.close();
        System.out.println(annUser.toString());
//        ConfigurationClassPostProcessor c = new ConfigurationClassPostProcessor();
//        c.postProcessBeanDefinitionRegistry();
//        ConfigurationClassParser parser = new ConfigurationClassParser()
    }


}
