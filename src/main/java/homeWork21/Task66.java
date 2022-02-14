/**
 * Наверное это задача с самым коротким кодом :)
 */
package main.java.homeWork21;

import java.time.LocalDate;

public class Task66 {

    public static final LocalDate LOCAL_DATE_NOW = LocalDate.now();
    public static final int DAYS_TO_SUBTRACT = 60;

    public static void main(String[] args) {
        System.out.println(LOCAL_DATE_NOW.minusDays(DAYS_TO_SUBTRACT));
    }
}
