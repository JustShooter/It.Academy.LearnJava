package main.java.HomeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMenu = new Scanner(System.in);
        String s;
        System.out.println("Введите 1 - для использования заранее заготовленной строки, или любое другое число, для ввода своей строки.");
        int menu = scannerMenu.nextInt();
        if (menu == 1)
            s = "  В   Этом  предложении мы   будем    искать слова, and, if we will found them, we will count them...";
        else s = scannerString.nextLine();
        Pattern p = Pattern.compile("[A-Za-zА-Яа-я]{2,}"); // Слово должно содержать не менее 2 букв
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}
