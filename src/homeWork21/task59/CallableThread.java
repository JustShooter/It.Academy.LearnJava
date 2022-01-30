package homeWork21.task59;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class CallableThread implements Callable<String> {

    public static final int MAXIMUM_TIME_TO_SLEEP_IN_SECONDS = 10;
    public static final int MINIMUM_TIME_TO_SLEEP_IN_SECONDS = 1;
    public static final int MILLIS_TO_SECONDS_MULTIPLIER = 1000;
    public static final Random RANDOM = new Random();
    public static final int BOUND = 100;
    public static final int MAX_SIZE_OF_COLLECTION = 10;

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.printf("Generating collection of \"%d\" random integer numbers in thread \"%s\" and calculating its sum.%n",
                MAX_SIZE_OF_COLLECTION,
                threadName);
        String str = String.valueOf(Stream
                .generate(() -> RANDOM.nextInt(BOUND))
                .limit(MAX_SIZE_OF_COLLECTION)
                .mapToInt(i -> i)
                .sum());


        Thread.sleep(getSleepTime(threadName));

        return str;
    }

    private int getSleepTime(String threadName) {
        int sleepTime = (RANDOM.nextInt(MAXIMUM_TIME_TO_SLEEP_IN_SECONDS)
                + MINIMUM_TIME_TO_SLEEP_IN_SECONDS)
                * MILLIS_TO_SECONDS_MULTIPLIER;
        System.out.printf("Trying to sleep \"%d\" seconds in thread \"%s\"%n",
                sleepTime / MILLIS_TO_SECONDS_MULTIPLIER,
                threadName);
        return sleepTime;
    }
}
