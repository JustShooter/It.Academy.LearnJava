package homeWork21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), month, 1);
                date.datesUntil(date.plusMonths(1))
                .map(localDate -> localDate.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")))
                .forEach(System.out::println);
    }
}
