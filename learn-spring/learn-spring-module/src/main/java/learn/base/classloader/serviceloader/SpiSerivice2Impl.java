package learn.base.classloader.serviceloader;

import learn.base.classloader.SPIService;

/**
 * @ClassName SpiSerivice1Impl
 * @Description SpiSerivice2Impl
 * @Author yunp
 * @Date 2020/7/4 9:45
 * @Version 1.0
 **/
public class SpiSerivice2Impl implements SPIService {


    @Override
    public void sayName() {
        System.out.println("SpiSerivice2");
    }
}
