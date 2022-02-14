package HomeWork6;

import java.util.Scanner;

public class Task9 {
    private int day;
    private int month;
    private int year;

    public void setDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int d = scanner.nextInt();
        System.out.println("Enter month:");
        int m = scanner.nextInt();
        System.out.println("Enter year:");
        int y = scanner.nextInt();
        scanner.close();
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDate() {
        System.out.println("Today is " + day + "." + month + "." + year);
    }

    public void getNextDay() {
        int d = this.day;
        int m = this.month;
        int y = this.year;
        switch (d) {
            case 28:
                if (m == 2) {
                    d = 1;
                    ++m;
                } else {
                    ++d;
                }
                break;
            case 30:
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    d = 1;
                    ++m;
                } else {
                    ++d;
                }
                break;
            case 31:
                d = 1;
                ++m;
                break;
            default:
                ++d;
        }
        if (m == 13) {
            m = 1;
            ++y;
        }
        System.out.println("Tomorrow is " + d + "." + m + "." + y);
    }

    public static void main(String[] args) {
        Task9 date = new Task9();
        date.setDate();
        date.printDate();
        date.getNextDay();
    }
}
