package HomeWork6;

import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static final int BOUND = 10000;
    /**
     * Store total value
     */
    private int total;

    public void setTotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант ввода суммы:\n 0 - случайное число от 0 до 9999 \n 1 - ручной ввод");
        System.out.println("Сделайте свой выбор:");
        int a = scanner.nextInt();
        int total1 = 0;
        switch (a) {
            case 0:
                total1 = (int) (new Random().nextInt(BOUND));
                break;
            case 1:
                System.out.println("Введите сумму:");
                total1 = scanner.nextInt();
                break;
            default:
                System.out.println("Неправильный выбор!");
        }
        this.total = total1;
    }

    public void getTotalRubles() {
        System.out.println("Результат:");
        int total2 = total % 100;
        if (total2 % 10 == 1 && total2 != 11) {
            System.out.println(total + " рубль");
        } else if (total2 % 10 >= 2 && total2 % 10 <= 4 && total2 != 12 && total2 != 13 && total2 != 14) {
            System.out.println(total + " рубля");
        } else {
            System.out.println(total + " рублей");
        }

    }

    public static void main(String[] args) {
        Task8 total = new Task8();
        total.setTotal();
        total.getTotalRubles();
    }
}
