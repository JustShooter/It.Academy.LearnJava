package homeWork21.task58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableThread implements Callable<List> {

    public static final int NUMBER_OF_STRING_LINES_TO_WRITE_IN_FILE = 10;
    public static final String FILE_EXTENSION = ".txt";
    public static final int MAXIMUM_TIME_TO_SLEEP_IN_SECONDS = 3;
    public static final int MINIMUM_TIME_TO_SLEEP_IN_SECONDS = 1;
    public static final int MILLIS_TO_SECONDS_MULTIPLIER = 1000;
    public static final Random RANDOM = new Random();

    @Override
    public List call() throws Exception {
        StringGenerator stringGenerator = new StringGenerator();
        List<String> list = new ArrayList();

        for (int i = 1; i <= NUMBER_OF_STRING_LINES_TO_WRITE_IN_FILE; i++) {
            String threadName = Thread.currentThread().getName();
            String fileName = threadName
                    + " "
                    + LocalTime.now().format(DateTimeFormatter.ofPattern("HH-mm-ss-ms"))
                    + " "
                    + i
                    + FILE_EXTENSION;
            System.out.printf("Creating file \"%s\" in thread \"%s\"%n", fileName, threadName);
            File file = new File(fileName);
            file.deleteOnExit();
            System.out.printf("Adding file to list in thread \"%s\"%n", threadName);
            list.add(file.getName());
            System.out.printf("Trying to write file in thread \"%s\"%n", threadName);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                System.out.printf("Writing \"%d\" random string lines to file \"%s\" in thread \"%s\"%n",
                        NUMBER_OF_STRING_LINES_TO_WRITE_IN_FILE,
                        fileName,
                        threadName);
                for (int j = 0; j < NUMBER_OF_STRING_LINES_TO_WRITE_IN_FILE; j++) {
                    bufferedWriter.write(stringGenerator.generateString());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        int sleepTime = (RANDOM.nextInt(MAXIMUM_TIME_TO_SLEEP_IN_SECONDS)
                + MINIMUM_TIME_TO_SLEEP_IN_SECONDS)
                * MILLIS_TO_SECONDS_MULTIPLIER;
        System.out.printf("Trying to sleep \"%d\" seconds in thread \"%s\"%n", sleepTime / MILLIS_TO_SECONDS_MULTIPLIER, Thread.currentThread().getName());
        Thread.sleep(sleepTime);

        return list;
    }
}
