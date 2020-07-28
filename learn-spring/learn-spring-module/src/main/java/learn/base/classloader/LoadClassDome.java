package learn.base.classloader;

/**
 * @ClassName Dome
 * @Description Dome
 * @Author yunp
 * @Date 2020/7/6 19:54
 * @Version 1.0
 **/
public class LoadClassDome {

    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        classLoader.loadClass("");

        Object o = new Object();
        o.equals("");

    }



}
