package main.java.HomeWork10;

import java.util.Scanner;

public class Task37 {

    public static int getDaysInSeason(Seasons seasons) {
        return seasons.getCountOfDays();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seasons season = Seasons.valueOf(scanner.nextLine());
        System.out.println(getDaysInSeason(season));
    }
}
