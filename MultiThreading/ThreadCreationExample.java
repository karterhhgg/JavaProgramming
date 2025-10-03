package MultiThreading;

// Creating a thread by extending the Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class.");
    }
}

// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface.");
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Using the Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Using the Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
