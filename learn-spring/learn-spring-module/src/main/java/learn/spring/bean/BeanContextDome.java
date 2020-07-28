package learn.spring.bean;

import learn.spring.bean.dome.BeanDome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName BeanContextDome
 * @Description BeanContextDome
 * @Author yunp
 * @Date 2020/7/6 14:47
 * @Version 1.0
 **/
public class BeanContextDome {


    public static void main(String[] args) {

        ApplicationContext actx = new FileSystemXmlApplicationContext("\\src\\main\\resources\\BeanLifecycle.xml");
        BeanDome bd = (BeanDome) actx.getBean("beanDome");

        System.out.println(bd.getMsg());

    }


}
