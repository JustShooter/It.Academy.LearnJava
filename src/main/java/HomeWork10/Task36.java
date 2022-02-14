package main.java.HomeWork10;

import java.util.Scanner;

public class Task36 {

    public static Seasons getNextSeason(String s) {
        Seasons seasons = Seasons.valueOf(s);
        if (seasons.ordinal() == Seasons.values().length - 1) {
            return Seasons.values()[0];
        } else {
            return Seasons.values()[seasons.ordinal() + 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        System.out.println(getNextSeason(season));
    }
}
