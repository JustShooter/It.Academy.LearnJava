package main.java.HomeWork5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int a = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int b = scanner.nextInt();
        System.out.println("Введите радиус круга:");
        int r = scanner.nextInt();
        if (Math.hypot(a, b) >= r * 2) {
            System.out.println("Не закроет");
        } else {
            System.out.println("Закроет");
        }
    }
}
