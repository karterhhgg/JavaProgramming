package MultiThreading;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag set to true.");
        }).start();

        new Thread(() -> {
            while (!flag) {
                // Busy wait
            }
            System.out.println("Flag is now true.");
        }).start();
    }
}
