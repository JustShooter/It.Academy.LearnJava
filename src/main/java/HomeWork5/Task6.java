package main.java.HomeWork5;

import java.util.Scanner;

public class Task6 {

    public static boolean checkLastDigit(int a) {
        return a % 10 == 7;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100000 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Выберите вариант ввода числа:");
        System.out.println("0 - Случайное число от 1 до 10001");
        System.out.println("Любое другое число - ручной ввод числа");
        if (scanner.nextInt() == 0) {
            a = getRandomNumber();
        } else {
            System.out.println("Введите любое число от 1 до 2147483647");
            a = scanner.nextInt();
        }
        System.out.println("Загаданное число: " + a);
        if (checkLastDigit(a)) {
            System.out.println("Последняя цифра в загаданном числе 7");
        } else {
            System.out.println("Последняя цифра в загадонном числе не 7");
        }
    }
}
