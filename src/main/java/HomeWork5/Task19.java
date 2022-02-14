package main.java.HomeWork5;

import java.util.Scanner;

public class Task19 {
    private int[] arr;

    public void setArrLength(int l) {
        arr = new int[l];
    }

    public int[] getArr() {
        return arr;
    }

    public int[] reversThisArray(int[] arr) {
        for (int i = 0; i < (arr.length) / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        return arr;
    }

    public int[] getReverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int i = 0;
        int j = reversed.length - 1;
        while (i < arr.length) {
            reversed[j] = arr[i];
            i++;
            j--;
        }
        return reversed;
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void fillArrayRandom(int[] arr) {
        for (int i = 0; i < (arr.length); i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public void printOddIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void printEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void printOddElements(int[] arr) {
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public void printEvenElements(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public void calculateSummBetweenMinMax(int[] arr) {
        // Поиск ячейки с минимальным значением
        int min_cell_num = 0; // Переменная для записи номера ячейки массива с минимальным значением
        int x = arr[0]; // Переменная стакан
        for (int i = 1; i < arr.length; i++) {
            if (x > arr[i]) {
                x = arr[i];
                min_cell_num = i;
            }
        }

        // Поиск ячейки с максимальным значением
        int max_cell_num = 0; // Переменная для записи номера ячейки массива с максимальным значением
        x = arr[0]; // Переменная стакан
        for (int i = 1; i < arr.length; i++) {
            if (x < arr[i]) {
                x = arr[i];
                max_cell_num = i;
            }
        }
        // Вывод номеров ячеек с максимальным и минимальными значениями
        System.out.println("Ячейка массива номер " + min_cell_num + " имеет минимальное значение равное: " + arr[min_cell_num]);
        System.out.println("Ячейка массива номер " + max_cell_num + " имеет максимальное значение равное: " + arr[max_cell_num]);

        // Цикл суммирования значений ячеек, находящихся между ячейками с мин и макс значениями
        int sum = 0; // Перенменная для записи суммы ячеек
        if (min_cell_num < max_cell_num) {
            for (int i = min_cell_num + 1; i < max_cell_num; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = max_cell_num + 1; i < min_cell_num; i++) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма ячеек, находящихся между ячейками с мин и макс значениями равна: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task19 arr = new Task19();
        System.out.println("Введите длинну массива:");
        int l = scanner.nextInt();
        arr.setArrLength(l);
        System.out.println("Заполняем массив случайными числами и");
        arr.fillArrayRandom(arr.getArr());
        System.out.println("Выводим полученный массив в консоль:");
        arr.printArray(arr.getArr());
        while (true) {
            System.out.println("Выберите действие с массивом:");
            System.out.println("1 - Вывести чётные элементы массива.");
            System.out.println("2 - Вывести нечётные элементы массива.");
            System.out.println("3 - Вывести элементы массива с чётным индексом.");
            System.out.println("4 - Вывести элементы массива с нечётным индексом.");
            System.out.println("5 - Вывести сумму ячеек между ячейками с минимальным и максимальным значением элементов.");
            System.out.println("6 - Вывести инвертированный массив.");
            System.out.println("7 - Инвертировать исходный массив.");
            System.out.println("0 - Выход.");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Выводим чётные элементы массива:");
                    arr.printEvenElements(arr.getArr());
                    break;
                case 2:
                    System.out.println("Выводим нечётные элементы массива:");
                    arr.printOddElements(arr.getArr());
                    break;
                case 3:
                    System.out.println("Выводим элементы массива с чётным индексом:");
                    arr.printEvenIndex(arr.getArr());
                    break;
                case 4:
                    System.out.println("Выводим элементы массива с нечётным индексом:");
                    arr.printOddIndex(arr.getArr());
                    break;
                case 5:
                    System.out.println("Выводим сумму ячеек между ячейками с минимальными и максимальными значениями:");
                    arr.calculateSummBetweenMinMax(arr.getArr());
                    break;
                case 6:
                    System.out.println("Выводим в консоль инвертированный массив:");
                    arr.printArray(arr.getReverseArray(arr.getArr()));
                    break;
                case 7:
                    System.out.println("Инвертируем и выводим в консоль инвертированный массив:");
                    arr.printArray(arr.reversThisArray(arr.getArr()));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("!!!Неверный выбор!!!");
                    continue;
            }
            if (menu == 0) {
                break;
            }
            System.out.println("Исходный массив для работы:");
            arr.printArray(arr.getArr());
        }
    }
}
