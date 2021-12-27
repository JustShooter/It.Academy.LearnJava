package HomeWork6;

import java.util.Scanner;

public class Task11 {
    private int dayofweek;

    public void getDaySchedule() {
        switch (dayofweek) {
            case 1:
                System.out.println("Расписание на понедельник:");
                System.out.println("Почитать литературу, перепроверить задания.");
                break;
            case 2:
                System.out.println("Расписание на вторник:");
                System.out.println("Повторить теорию, подготовиться к контрольной.");
                break;
            case 3:
                System.out.println("Расписание на среду:");
                System.out.println("Выполнить теоритическую часть домашнего задания.\nНачать выполнять практическую часть.");
                break;
            case 4:
                System.out.println("Расписание на четверг:");
                System.out.println("Повторить теорию, продолжить выполнение практической части.");
                break;
            case 5:
                System.out.println("Расписание на пятницу:");
                System.out.println("Выполнить теоритическую часть домашнего задания.\nПо возможности продолжить выполнение практической части.");
                break;
            case 6:
                System.out.println("Расписание на субботу:");
                System.out.println("Закрепление пройденого материала.\nПродолжить выполнять практическую часть задания.");
                break;
            case 7:
                System.out.println("Расписание на воскресенье:");
                System.out.println("Чтение литературы.\nПовторение пройденого материала.\nЗакончить и проверить практическую часть задания.");
                break;
            default:
                System.out.println("Такого дня недели не существует!");
        }
    }

    public static void main(String[] args) {
        Task11 d = new Task11();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели.");
        d.dayofweek = scanner.nextInt();
        d.getDaySchedule();
    }
}
