package collections;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
//    static int count = 0;

    static AtomicInteger count = new AtomicInteger();

    public synchronized static void increment() {
//        count.incrementAndGet();
        count.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl1());
        Thread thread2 = new Thread(new MyRunnableImpl1());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(count);
    }
}

class MyRunnableImpl1 implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}
