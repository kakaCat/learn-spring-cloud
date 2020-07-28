package learn.base.classloader;

import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * @ClassName ClassLoaderDemo
 * @Description ClassLoaderDemo
 * @Author yunp
 * @Date 2020/7/7 9:55
 * @Version 1.0
 **/
public class ClassLoaderDemo {

    public static void main(String[] args) {


        System.out.println("ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader());
        System.out.println("DNSNameService's ClassLoader is " + DNSNameService.class.getClassLoader());
        System.out.println("String's ClassLoader is " + String.class.getClassLoader());


    }

}
