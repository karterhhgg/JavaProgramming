package MultiThreading;

public class ThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is in RUNNABLE state.");
                Thread.sleep(1000); // Thread is in TIMED_WAITING state
                System.out.println("Thread is waking up.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread is in NEW state.");
        thread.start();
        System.out.println("Thread has been started.");

        thread.join(); // Main thread is in WAITING state
        System.out.println("Thread is in TERMINATED state.");
    }
}
