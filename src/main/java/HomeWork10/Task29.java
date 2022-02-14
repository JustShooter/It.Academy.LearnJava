package main.java.HomeWork10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    private String s;
    private Pattern p;
    private Matcher m;

    public Pattern getP() {
        return p;
    }

    public void setP(Pattern p) {
        this.p = p;
    }

    public Matcher getM() {
        return m;
    }

    public void setM(Matcher m) {
        this.m = m;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getString() {
        String s;
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMenu = new Scanner(System.in);
        System.out.println("Введите 1 - для использования заранее заготовленной строки, или любое другое число, для ввода своей строки.");
        int menu = scannerMenu.nextInt();
        if (menu == 1)
            s = "Розовый 0xFFC0CB, Красный 0xFF0000, Оранжевый 0xFFA500 yellow 0xFFFF00 и ещё что то 0x1f8c для проверки 0x1ff";
        else s = scannerString.nextLine();
        scannerMenu.close();
        scannerString.close();
        return s;
    }

    public String findHex(Matcher m) {
        StringBuilder tmp = new StringBuilder();
        while (m.find()) {
            tmp.append(m.group() + "\n");
        }
        System.out.println();
        String str = tmp.toString();
        return str;
    }

    public void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Task29 s = new Task29();
        s.setS(s.getString());
        System.out.println("Ваша строка:");
        System.out.println(s.getS());
        System.out.println("Результат:");
        s.setP(Pattern.compile("0[xX][A-Fa-f0-9]+"));
        s.setM(s.getP().matcher(s.getS()));
        s.printString(s.findHex(s.getM()));
/*        while (s.getM().find()) {
            System.out.println(m.group());
        }*/
    }
}
