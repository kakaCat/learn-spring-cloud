package learn.ttl;

/**
 * @ClassName TL
 * @Description ThreadLocal
 * @Author yunp
 * @Date 2020/9/27 15:26
 * @Version 1.0
 **/
public class TL {


    private static ThreadLocal tl = new ThreadLocal<>();


    public static void main(String[] args) {
        tl.set(1);
        System.out.println(String.format("当前线程名称: %s, main方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
        fc();
        new Thread(TL::fc).start();
    }

    private static void fc() {
        System.out.println(String.format("当前线程名称: %s, fc方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
    }
}
