package main.java.HomeWork7;

import java.util.Scanner;

// Создано на основе Task19 с изменениями в меню (добавлен пункт 8 и 9)
// Пункт 6 работает через массив стакан
// Пункт 7 инвертирует исходный массив
// Пункт 8 выводит исходный массив в обратном порядке
// Так же внесены изменения в метод calculateSummBetweenMinMax (пункт 5)
// теперь используется максимальное расстояние между ячейками с максимальным и минимальными значениями. (в теории)
// Задания 20, 21 и 22 объеденены в одно.


public class Task20 {
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

    public void printArrayBackwards(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
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

    public void findMaxElement(int[] arr) {
        int x = arr[0]; // Переменная стакан
        for (int i = 1; i < arr.length; i++) {
            if (x < arr[i]) {
                x = i;
            }
        }
        System.out.println("Элемент массива с индексом " + x + " имеет значение : " + arr[x]);
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

        int min_cell_num2 = 0;
        x = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (x > arr[i]) {
                x = arr[i];
                min_cell_num2 = i;
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

        int max_cell_num2 = 0; // Переменная для записи номера ячейки массива с максимальным значением
        x = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x < arr[i]) {
                x = arr[i];
                max_cell_num2 = i;
            }
        }
        int sum = 0; // Перенменная для записи суммы ячеек
        int realmincell = min_cell_num;
        int realmaxcell = max_cell_num;
        if (max_cell_num != max_cell_num2 || min_cell_num != min_cell_num2) {
            if (min_cell_num < max_cell_num && min_cell_num < max_cell_num2 && min_cell_num2 < max_cell_num && min_cell_num2 < max_cell_num2) {
                realmincell = Math.min(min_cell_num, min_cell_num2);
                realmaxcell = Math.max(max_cell_num, max_cell_num2);
            } else if (max_cell_num < min_cell_num && max_cell_num < min_cell_num2 && max_cell_num2 < min_cell_num && max_cell_num2 < min_cell_num2) {
                realmincell = Math.max(min_cell_num, min_cell_num2);
                realmaxcell = Math.min(max_cell_num, max_cell_num2);
            } else if (min_cell_num < max_cell_num2 && max_cell_num < min_cell_num2) {
                if ((max_cell_num2 - min_cell_num) > (min_cell_num2 - max_cell_num)) {
                    realmaxcell = max_cell_num2;
                    realmincell = min_cell_num;
                } else {
                    realmaxcell = max_cell_num;
                    realmincell = min_cell_num2;
                }
            } else if (min_cell_num > max_cell_num2 && max_cell_num > min_cell_num2) {
                if ((min_cell_num - max_cell_num2) > (max_cell_num - min_cell_num2)) {
                    realmaxcell = max_cell_num2;
                    realmincell = min_cell_num;
                } else {
                    realmaxcell = max_cell_num;
                    realmincell = min_cell_num2;
                }
            } else if (min_cell_num < max_cell_num && min_cell_num2 < max_cell_num2) {
                if ((max_cell_num - min_cell_num) > (max_cell_num2 - min_cell_num2)) {
                    realmaxcell = max_cell_num;
                    realmincell = min_cell_num;
                } else {
                    realmaxcell = max_cell_num2;
                    realmincell = min_cell_num2;
                }
            } else {
                if ((min_cell_num - max_cell_num) > (min_cell_num2 - max_cell_num2)) {
                    realmaxcell = max_cell_num;
                    realmincell = min_cell_num;
                } else {
                    realmaxcell = max_cell_num2;
                    realmincell = min_cell_num2;
                }
            }
        }

        // Вывод номеров ячеек с максимальным и минимальными значениями
/*
        System.out.println("Ячейка массива номер " + min_cell_num + " имеет минимальное значение равное: " + arr[min_cell_num]);
        System.out.println("Ячейка массива номер " + min_cell_num2 + " имеет минимальное значение равное: " + arr[min_cell_num2]);
        System.out.println("Ячейка массива номер " + max_cell_num + " имеет максимальное значение равное: " + arr[max_cell_num]);
        System.out.println("Ячейка массива номер " + max_cell_num2 + " имеет максимальное значение равное: " + arr[max_cell_num2]);
        System.out.println("Отладочная информация выше");
*/
        System.out.println("Ячейка массива номер " + realmincell + " имеет минимальное значение равное: " + arr[realmincell]);
        System.out.println("Ячейка массива номер " + realmaxcell + " имеет максимальное значение равное: " + arr[realmaxcell]);

        // Цикл суммирования значений ячеек, находящихся между ячейками с мин и макс значениями
        if (realmincell < realmaxcell) {
            for (int i = realmincell + 1; i < realmaxcell; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = realmaxcell + 1; i < realmincell; i++) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма ячеек, находящихся между ячейками с мин и макс значениями равна: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task20 arr = new Task20();
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
            System.out.println("6 - Вывести инвертированный массив через создание массива стакана.");
            System.out.println("7 - Инвертировать исходный массив.");
            System.out.println("8 - Вывести массив в обратном порядке (инвертированный).");
            System.out.println("9 - Найти максимальный элемент и вывести его индекс и значение.");
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
                    System.out.println("Выводим сумму ячеек между ячейками с минимальными и максимальными\nзначениями с максимальным расстоянием между ячейками:");
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
                case 8:
                    System.out.println("Выводим массив в обратном порядке(в инвертированном виде):");
                    arr.printArrayBackwards(arr.getArr());
                    break;
                case 9:
                    System.out.println("Находим максимальный элемент:");
                    arr.findMaxElement(arr.getArr());
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

