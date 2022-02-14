package main.java.HomeWork5;

import java.util.Scanner;

public class Task4 {
    public static int makeCompute(int x, int y) {
        return ((x * y) + (x + y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой переменной:");
        int x = scanner.nextInt();
        System.out.println("Введите значение второй переменной:");
        int y = scanner.nextInt();
        System.out.println("Результат вычисления:" + makeCompute(x, y));
    }

}
