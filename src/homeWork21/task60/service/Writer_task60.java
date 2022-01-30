package homeWork21.task60.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer_task60 {

    public static final boolean APPEND = true;

    public synchronized static void writeMessageToFile(File file, String message, String threadName) {
        System.out.printf("Trying to write \"%s\" to file \"%s\" from thread \"%s\"%n", message, file, threadName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, APPEND))) {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
