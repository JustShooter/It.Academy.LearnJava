package main.java.homeWork21.task60;

import main.java.homeWork21.task60.service.Writer_task60;

import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    public static final String FILE_EXTENSION = ".txt";
    public static final String PATTERN = "HH-mm-ss-ms";
    public static final String FILE_NAME = "task60";

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();

        System.out.printf("\"%s\" is starting to work!%n",
                threadName);

        String fileName = FILE_NAME + FILE_EXTENSION;

        String message = getMessage();

        System.out.printf("Thread \"%s\" sending string message:%n\"%s\"%nto file writer method%n",
                threadName,
                message);

        File file = new File(fileName);
        file.deleteOnExit(); // Это что бы не захламлять проект.
        Writer_task60.writeMessageToFile(file, message, threadName);

        return message;
    }

    private String getMessage() {
        return "Hello world " + LocalTime.now().format(DateTimeFormatter.ofPattern(PATTERN));
    }
}
