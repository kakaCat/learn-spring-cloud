package learn.base.thread;

public class MyTest {
    public static void main(String[] args) {
        final MyTask myTask = new MyTask();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.executeCondition1();
            }
        });
        t1.setName("t1");

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.executeCondition2();
            }
        });
        t2.setName("t2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTask.executeSignal1();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
