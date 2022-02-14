/**
 * now() - возвращает только дату из системных часов.
 * далее, создаём стрим от текущей даты
 * потом, добавляем время, форматируем запись
 * и выводим :)
 */
package main.java.homeWork21;

import java.text.ParseException;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.now;

public class Task65 {

    public static final int HOUR = 13;
    public static final int MINUTE = 0;

    public static void main(String[] args) throws ParseException {

        now().datesUntil(now().plusMonths(2), Period.ofWeeks(1))
                .map(localDate -> localDate.atTime(HOUR, MINUTE))
                .map(localDate -> localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy г. EEEE HH:mm")))
                .forEach(System.out::println);
    }
}
