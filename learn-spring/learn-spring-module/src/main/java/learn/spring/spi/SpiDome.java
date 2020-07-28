package learn.spring.spi;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName SpiDome
 * @Description spi
 * @Author yunp
 * @Date 2020/6/28 17:31
 * @Version 1.0
 **/
public class SpiDome {


    public static void main(String[] args) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        Set<String> names = new LinkedHashSet<>(
//                SpringFactoriesLoader.loadFactoryNames(ApplicationContextInitializer.class, classLoader));

//        Set<String> names = new LinkedHashSet<>(
//                SpringFactoriesLoader.loadFactoryNames(SpringBootExceptionReporter.class, classLoader));

        Set<String> names = new LinkedHashSet<>(
                SpringFactoriesLoader.loadFactoryNames(ApplicationListener.class, classLoader));
        String str = JSON.toJSONString(names);
        System.out.println(str);

    }

}
