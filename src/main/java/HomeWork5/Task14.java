package HomeWork5;

public class Task14 {
    public static void main(String[] args) {
        long x = 7893823445L;
        System.out.print("Сумма цифр числа " + x + " равна ");
        int summ = 0;
        do {
            summ += x % 10;
            x = x / 10;
        } while (x > 0);
        System.out.print(summ);
    }
}
