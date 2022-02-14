package main.java.HomeWork6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        int digit = number;
        int digitplace = 0;
        System.out.println(new DecimalFormat("###,###").format(number));

        while (digit > 0) {
            digitplace++;
            digit /= 10;
        }

        while (digitplace > 0) {
            digit = (int) ((number / Math.pow(10, digitplace - 1)) % 10);
            System.out.print(digit);
            digitplace--;
            if ((digitplace) % 3 == 0) System.out.print(" ");
        }
    }
}
