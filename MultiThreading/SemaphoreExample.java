package MultiThreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Only 2 threads can access the resource at a time

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " has acquired the permit.");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is releasing the permit.");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
        new Thread(task, "Thread-3").start();
    }
}
