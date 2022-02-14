/**
 * Надеюсь условие задачи понял правильно
 */
package main.java.HomeWork17.Task45;

public class Task45 {
    public static void main(String[] args) {
        try {
            doException().equals("Test");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Continue working");
    }

    public static String doException() {
        return null;
    }

}
