/**
 * now() - возвращает только дату из системных часов.
 * далее, создаём стрим от текущей даты
 * потом, добавляем время, форматируем запись
 * и выводим :)
 */
package homeWork21;

import java.text.ParseException;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.now;

public class Task65 {
    public static void main(String[] args) throws ParseException {

        now().datesUntil(now().plusMonths(2), Period.ofWeeks(1))
                .map(localDate -> localDate.atTime(13, 0))
                .map(localDate -> localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy г. EEEE HH:mm")))
                .forEach(System.out::println);
    }
}
