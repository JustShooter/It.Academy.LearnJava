package HomeWork8.Task25;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b20, b50, b100;
        System.out.println("ATM initialising");
        System.out.println("Enter 20 rubles banknote quantity in ATM:");
        b20 = scanner.nextInt();
        System.out.println("Enter 50 rubles banknote quantity in ATM:");
        b50 = scanner.nextInt();
        System.out.println("Enter 100 rubles banknote quantity in ATM:");
        b100 = scanner.nextInt();
        ATM atm01 = new ATM(b100, b50, b20);
        atm01.printTotalAmountInATM();
        System.out.println("Maximum withdraw amount at once is " + atm01.checkMaxWithdrawAmount());
        System.out.println("Enter withdraw amount in rubles:");
        int withdraw_sum = scanner.nextInt();
        if (atm01.withdrawSum(withdraw_sum)) System.out.println("Operation was successful!");
        else System.out.println("Error!!!");
        atm01.printTotalAmountInATM();
        atm01.loadATM();
        System.out.println("Maximum withdraw amount at once is " + atm01.checkMaxWithdrawAmount());
        System.out.println("Enter withdraw amount in rubles:");
        withdraw_sum = scanner.nextInt();
        if (atm01.withdrawSum(withdraw_sum)) System.out.println("Operation was successful!");
        else System.out.println("Error!!!");
        atm01.printTotalAmountInATM();
    }
}
