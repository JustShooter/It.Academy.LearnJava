package main.java.HomeWork5;

public class Task12 {

    public static int getFactorial(int a) {
        if (a == 1) return a;
        if (a < 0) return 0;
        return a * getFactorial(a - 1);
    }

    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println("Факториал числа: " + i + " равен: " + getFactorial(i));
            i++;
        }
    }
}
