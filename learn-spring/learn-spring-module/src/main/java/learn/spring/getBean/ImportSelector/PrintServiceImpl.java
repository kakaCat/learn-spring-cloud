package learn.spring.getBean.ImportSelector;

/**
 * @ClassName PrintServiceImpl
 * @Description PrintServiceImpl
 * @Author yunp
 * @Date 2020/7/29 11:28
 * @Version 1.0
 **/
public class PrintServiceImpl  implements PrintService{

    @Override
    public void print(String msg) {
        System.out.println("Hello : " + msg);
    }
}
