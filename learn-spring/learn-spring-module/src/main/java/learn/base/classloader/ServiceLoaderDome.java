package learn.base.classloader;

import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName ServiceLoaderDome
 * @Description ServiceLoader
 * @Author yunp
 * @Date 2020/6/30 11:23
 * @Version 1.0
 **/
public class ServiceLoaderDome {

    public static void main(String[] args) {
        Iterator<SPIService> providers = Service.providers(SPIService.class);
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        for (SPIService spiService : load) {
            spiService.sayName();
        }
    }


}
