package main.java.homeWork21.task60;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task60 {
    public static final int NUMBER_OF_THREAD_POOLS = 10;
    public static final int N_THREADS = 3;

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(N_THREADS);

        Callable<String> callableThread = new CallableThread();

        List<Future<String>> futureList = new ArrayList<>();

        startThreadPool(threadPool, callableThread, futureList);

        printFutureList(futureList);

        System.out.println("Shutting down ExecutorService");
        threadPool.shutdown();
        System.out.println("Main finished");

    }

    private static void printFutureList(List<Future<String>> futureList) {
        for (Future<String> future : futureList) {
            try {
                System.out.println("The result from future is:\n" + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private static void startThreadPool(ExecutorService threadPool, Callable<String> callableThread, List<Future<String>> futureList) {
        for (int i = 0; i < NUMBER_OF_THREAD_POOLS; i++) {
            futureList.add(threadPool.submit(callableThread));
        }
    }
}
