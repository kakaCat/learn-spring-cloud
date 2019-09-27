package learn.base.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Aqs {
//    AbstractQueuedSynchronizer



    private static Lock mainLock = new ReentrantLock(false);

//    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//

    private static int count =0;

    public static void main(String[] args) {

//        lock.readLock().lock();

        for(int i = 0;i<20;i++){
            Thread t1 = new Thread(()->{
                mainLock.lock();

                System.out.println(Thread.currentThread().getName());

                mainLock.unlock();
            });
            t1.setName("t"+i);
            t1.start();
        }
//        for(int i = 0;i<10;i++){
//            Thread t1 = new Thread(()->{
//                mainLock.lock();
//
//                count +=1;
//
//                mainLock.unlock();
//            });
//            t1.setName("t2");
//            t1.start();
//        }


//        System.out.println("111");


        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
