package learn.spring.bean;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @ClassName BeanInitStartDome
 * @Description BeanInitStartDome
 * @Author yunp
 * @Date 2020/7/6 14:57
 * @Version 1.0
 **/
public class BeanInitStartDome {

    public static void main(String[] args) {
        BeanInitDome d = new BeanInitDome();
        BeanWrapper bw = new BeanWrapperImpl(d) ;


    }


}
