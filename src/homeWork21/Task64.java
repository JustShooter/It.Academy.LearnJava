package homeWork21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Task64 {

    public static final String PATTERN = "d::MMM::uuuu";

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), getMonth(), 1);
        printAllDaysOfGivenDate(date);
    }

    private static void printAllDaysOfGivenDate(LocalDate date) {
        date.datesUntil(date.plusMonths(1))
                .map(localDate -> localDate.format(DateTimeFormatter.ofPattern(PATTERN)))
                .forEach(System.out::println);
    }

    private static int getMonth() {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        return month;
    }
}
