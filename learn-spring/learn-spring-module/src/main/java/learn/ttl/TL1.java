package learn.ttl;

/**
 * @ClassName TL1
 * @Description ThreadLocal
 * @Author yunp
 * @Date 2020/9/27 15:28
 * @Version 1.0
 **/
public class TL1 {

    private static ThreadLocal tl = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        tl.set(1);
        System.out.println(String.format("当前线程名称: %s, main方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
        fc();
        new Thread(()->{
            tl.set(2); //在子线程里设置上下文内容为2
            fc();
        }).start();
        Thread.sleep(1000L); //保证下面fc执行一定在上面异步代码之后执行
        fc(); //继续在主线程内执行，验证上面那一步是否对主线程上下文内容造成影响
    }

    private static void fc() {
        System.out.println(String.format("当前线程名称: %s, fc方法内获取线程内数据为: %s",
                Thread.currentThread().getName(), tl.get()));
    }
}
