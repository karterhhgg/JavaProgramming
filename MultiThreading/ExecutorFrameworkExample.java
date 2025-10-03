package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submitting a Runnable task
        executor.submit(() -> {
            System.out.println("Runnable task executed by " + Thread.currentThread().getName());
        });

        // Submitting a Callable task
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task executed by " + Thread.currentThread().getName());
            return 123;
        };

        Future<Integer> future = executor.submit(callableTask);
        System.out.println("Result from callable task: " + future.get());

        executor.shutdown();
    }
}
