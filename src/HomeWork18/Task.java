package HomeWork18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        File file = new File("Strings.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            bufferedReader
                    .lines()
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .stream()
                    .toList()
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
