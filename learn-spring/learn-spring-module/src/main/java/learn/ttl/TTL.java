package learn.ttl;

/**
 * @ClassName TTL
 * @Description InheritableThreadLocal
 * @Author yunp
 * @Date 2020/9/27 16:37
 * @Version 1.0
 **/
public class TTL {


    private static ThreadLocal tl = new InheritableThreadLocal<>();


    public static void main(String[] args) {
        tl.set(1);
        System.out.println(String.format("当前线程名称: %s, main方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
        fc();
        new Thread(TTL::fc).start();
    }

    private static void fc() {
        System.out.println(String.format("当前线程名称: %s, fc方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
    }

}
