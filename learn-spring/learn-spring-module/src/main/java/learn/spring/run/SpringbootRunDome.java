package learn.spring.run;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName SpringbootRunDome
 * @Description SpringbootRunDome
 * @Author yunp
 * @Date 2020/7/1 17:08
 * @Version 1.0
 **/
public class SpringbootRunDome {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Set<String> names = new LinkedHashSet<>(SpringFactoriesLoader.loadFactoryNames(ApplicationContextInitializer.class, classLoader));

//        getSpringFactoriesInstances(ApplicationContextInitializer.class)
        String str = JSON.toJSONString(names);
        System.out.println(str);

    }



}
