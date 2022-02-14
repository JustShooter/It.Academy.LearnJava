package main.java.HomeWork10;

import java.util.Scanner;

// Это заданее было сделано ранее, подсчёт знаков препинания не выносился в отдельный метод
public class Task26 {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMenu = new Scanner(System.in);
        String s;
        System.out.println("Введите 1 - для использования заранее заготовленной строки, или любое другое число, для ввода своей строки.");
        int menu = scannerMenu.nextInt();
        if (menu == 1) s = "Знаков, ! препинания: ,;.?! может быть много?! Или, ! может? Да ... Нет! ? о .";
        else s = scannerString.nextLine();
        System.out.println("Ваша строка:");
        System.out.println(s);
        int zp = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '!' && s.charAt(i) <= '.') || (s.charAt(i) >= ':' && s.charAt(i) <= '?')) {
                zp += 1;
            }
        }
        if (zp != 0) System.out.println("В данной строке " + zp + " знаков препинания.");
        else System.out.println("В данной строке нет знаков препинания!");
    }
}
