package main.java.HomeWork6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first house");
        System.out.println("Enter size a:");
        a = scanner.nextInt();
        System.out.println("Enter size b:");
        b = scanner.nextInt();
        System.out.println("Enter size of second house");
        System.out.println("Enter size c:");
        c = scanner.nextInt();
        System.out.println("Enter size d:");
        d = scanner.nextInt();
        System.out.println("Enter size of the land plot");
        System.out.println("Enter size e:");
        e = scanner.nextInt();
        System.out.println("Enter size f:");
        f = scanner.nextInt();
        if ((a + c) <= e && f >= b && f >= d) {          // Условия проверяет можно ли поставить дома вряд с лева на право
            System.out.println("Houses fits land plot");
        } else if ((b + d) <= f && e >= a && e >= c) {    // Условие проверяет можно ли поставить дома в ряд с верху вних
            System.out.println("Houses fits land plot");
        } else {
            System.out.println("Houses not fits land plot");
        }
    }
}
