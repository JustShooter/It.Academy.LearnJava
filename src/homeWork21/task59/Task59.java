package homeWork21.task59;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task59 {
    public static final int NUMBER_OF_THREAD_POOLS = 10;
    public static final int N_THREADS = 3;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(N_THREADS);

        Callable<String> callableThread = new CallableThread();

        List<Future<String>> futureList = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_THREAD_POOLS; i++) {
            futureList.add(threadPool.submit(callableThread));
        }

        for (Future<String> future : futureList) {
            try {
                System.out.println("The result from future is:\n" + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Shutting down ExecutorService");
        threadPool.shutdown();
        System.out.println("Main finished");
    }
}
