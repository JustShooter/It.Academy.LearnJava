package main.java.HomeWork10;

import java.util.Scanner;

// Это задание было сделано ранее, получение строки из последних букв не выносилось в отдельный метод
public class Task28 {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMenu = new Scanner(System.in);
        String s;
        System.out.println("Введите 1 - для использования заранее заготовленной строки, или любое другое число, для ввода своей строки.");
        int menu = scannerMenu.nextInt();
        if (menu == 1) s = " ВотжеЖ Лабы Титов line паБ welcome футбол java loop stay PandaDoc букварь.  ";
        else s = scannerString.nextLine();
        scannerMenu.close();
        scannerString.close();
        System.out.println("Ваша строка:");
        System.out.println(s);
        System.out.println("Результат:");
        String glass = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'А' && s.charAt(i) <= 'я')) {
                glass += s.charAt(i);
            } else {
                if (!glass.equals("")) {
                    System.out.print(glass.charAt(glass.length() - 1));
                    glass = "";
                }
            }
        }
        if (!glass.equals("")) {
            System.out.print(glass.charAt(glass.length() - 1));
        }
        System.out.println();
    }
}
