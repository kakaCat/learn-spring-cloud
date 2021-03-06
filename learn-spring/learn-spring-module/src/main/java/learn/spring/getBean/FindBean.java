package learn.spring.getBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FindBean {

    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
        //比如：<bean id="userService" class="com.cloud.service.impl.UserServiceImpl"></bean>
        Object userService = ac.getBean("userService");


    }

    public void getBean(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
        //比如：<bean id="userService" class="com.cloud.service.impl.UserServiceImpl"></bean>
        ac.getBean("userService");
    }

//    public void getWebBean(){
//        ApplicationContext ac1 = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletContext sc);
//        ApplicationContext ac2 = WebApplicationContextUtils.getWebApplicationContext(ServletContext sc);
//        ac1.getBean("beanId");
//        ac2.getBean("beanId");
//    }



}
