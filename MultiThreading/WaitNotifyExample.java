package MultiThreading;

class Message {
    private String message;
    private boolean hasMessage = false;

    public synchronized void produce(String message) {
        while (hasMessage) {
            try {
                wait(); // Wait for the consumer to consume the message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        hasMessage = true;
        System.out.println("Produced: " + message);
        notify(); // Notify the consumer that a message is available
    }

    public synchronized String consume() {
        while (!hasMessage) {
            try {
                wait(); // Wait for the producer to produce a message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + message);
        hasMessage = false;
        notify(); // Notify the producer that the message has been consumed
        return message;
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Message message = new Message();

        Thread producer = new Thread(() -> {
            String[] messages = {"First", "Second", "Third", "Done"};
            for (String msg : messages) {
                message.produce(msg);
            }
        });

        Thread consumer = new Thread(() -> {
            for (String msg = message.consume(); !msg.equals("Done"); msg = message.consume()) {
                // The work is done in the consume method
            }
        });

        producer.start();
        consumer.start();
    }
}
