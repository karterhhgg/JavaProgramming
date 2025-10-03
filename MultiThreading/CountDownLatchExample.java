package MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is working.");
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished.");
        };

        new Thread(task, "Worker-1").start();
        new Thread(task, "Worker-2").start();
        new Thread(task, "Worker-3").start();

        latch.await(); // Main thread waits until the latch count is zero

        System.out.println("All workers have finished their tasks.");
    }
}
