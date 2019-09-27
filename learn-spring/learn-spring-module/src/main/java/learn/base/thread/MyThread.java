package learn.base.thread;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

public class MyThread {

    public static void main(String[] args)
            throws IllegalAccessException, NoSuchFieldException, IOException, InterruptedException {


        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);

        Unsafe unsafe = (Unsafe) f.get(null);

        Thread thread=new Thread(
                ()->{
                    unsafe.park(false,0L);
                    System.out.println("线程一执行");
                }
        );
        thread.start();

        Thread thread2=new Thread(
                ()->{
                    unsafe.park(false,0L);
                    System.out.println("线程二执行");
                }
        );
        thread2.start();
        TimeUnit.SECONDS.sleep(1L);
//        unsafe.unpark(thread2);
//        unsafe.unpark(thread);
        System.in.read();
    }



}
