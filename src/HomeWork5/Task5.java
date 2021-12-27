package HomeWork5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task5 {

    public static void print(int sec, int min, int hours, int days, int weeks) {
        System.out.println("Количество секунд в загаданном числе: " + sec);
        System.out.println("Количество минут в загаданном числе: " + min);
        System.out.println("Количество часов в загаданном числе: " + hours);
        System.out.println("Количество дней в загаданном числе: " + days);
        System.out.println("Количество недель в загаданном числе: " + weeks);
    }

    public static int getTime() {
        return (int) (Math.random() * 10000000);
    }

    public static void main(String[] args) {
        int sec, min, hours, days, weeks;
        int t = getTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вараиант ввода секунд:");
        System.out.println("0 - Ручной ввод");
        System.out.println("Любая друга цифра - Случайное число");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Введите любое число от 1 до 2147483647");
            t = scanner.nextInt();
        } else {
            t = getTime();
        }
        System.out.println("Загаданное число секунд: " + t);
        System.out.println("Выберите вариант расчёта:");
        System.out.println("0 - Через класс TimeUnit");
        System.out.println("1 - Через математический расчёт");
        int b = scanner.nextInt();
        switch (b) {
            case 0:
                sec = t % 60;
                min = (int) (TimeUnit.SECONDS.toMinutes(t) % 60);
                hours = (int) (TimeUnit.SECONDS.toHours(t) % 24);
                days = (int) TimeUnit.SECONDS.toDays(t);
                weeks = (int) (TimeUnit.SECONDS.toDays(t) / 7);
                print(sec, min, hours, days, weeks);
                break;
            case (1):
                sec = t % 60;
                t -= sec;
                min = (t / 60) % 60;
                t -= min;
                hours = (t / 3600) % 24;
                t -= hours;
                days = (t / 86400);
                weeks = (t / 604800);
                print(sec, min, hours, days, weeks);
                break;
            default:
                System.out.println("!!!Неверный выбор!!!");
        }
    }
}
