package HomeWork7;

import java.util.Scanner;

public class Task23 {
    private int[][] arr;

    public void setArrLength(int l) {
        arr = new int[l][l];
    }

    public int[][] getArr() {
        return arr;
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillArrayButterfly(int[][] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < i || j >= (arr[i].length - i)) arr[i][j] = 0;
                else arr[i][j] = 1;

            }
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < (arr[i].length - (i + 1)) || j > i) arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task23 arr = new Task23();
        System.out.println("Введите длинну квадратного массива:");
        int l = scanner.nextInt();
        arr.setArrLength(l);
        arr.fillArrayButterfly(arr.getArr());
        arr.printArray(arr.getArr());

    }

}