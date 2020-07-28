package learn.spring.bean;

import learn.spring.bean.dome.BeanDome;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @ClassName BeanWrapperDome
 * @Description BeanWrapperDome
 * @Author yunp
 * @Date 2020/7/6 14:30
 * @Version 1.0
 **/
public class BeanWrapperDome {


    public static void main(String[] args) {
        BeanDome beanDome = new BeanDome();

        BeanWrapper bw = new BeanWrapperImpl(beanDome) ;

        bw.setPropertyValue("msg","HelloWorld");


        System.out.println(bw.getPropertyValue("msg"));

    }


}
