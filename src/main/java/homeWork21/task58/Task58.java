package main.java.homeWork21.task58;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task58 {

    public static final int NUMBER_OF_THREAD_POOLS = 10;
    public static final int N_THREADS = 3;

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(N_THREADS);

        Callable<List> callableThread = new CallableThread();

        List<Future<List>> futureList = new ArrayList<>();

        startThreadPool(threadPool, callableThread, futureList);

        printFutureList(futureList);

        System.out.println("Shutting down ExecutorService");
        threadPool.shutdown();
        System.out.println("Main finished");

    }

    private static void startThreadPool(ExecutorService threadPool, Callable<List> callableThread, List<Future<List>> futureList) {
        for (int i = 0; i < NUMBER_OF_THREAD_POOLS; i++) {
            futureList.add(threadPool.submit(callableThread));
        }
    }

    private static void printFutureList(List<Future<List>> futureList) {
        for (Future<List> future : futureList) {
            System.out.println("Printing list from callable thread:");
            try {
                future.get().forEach(System.out::println);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

