package learn.base.classloader;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;

/**
 * @ClassName BeanUitlsDome
 * @Description BeanUtilsDome
 * @Author yunp
 * @Date 2020/6/30 11:33
 * @Version 1.0
 **/
public class BeanUtilsDome {

    public BeanUtilsDome(){}


    public static void main(String[] args) {

        BeanUtilsDome beanUtilsDome = BeanUtils.instantiateClass(BeanUtilsDome.class);
        Constructor<?> constructor = null;
        try {
            constructor = BeanUtilsDome.class.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
//        Constructor<?> constructor = BeanUtilsDome.class.getDeclaredConstructor("");
        BeanUtilsDome instance = (BeanUtilsDome) BeanUtils.instantiateClass(constructor, args);
//        BeanUtils.
    }

}
