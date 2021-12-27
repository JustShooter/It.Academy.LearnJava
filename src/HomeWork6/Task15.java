package HomeWork6;

public class Task15 {

    public static boolean checkIsPrimeNumber(int x) {
        boolean prime = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 50; i <= 70; i++) {
            if (checkIsPrimeNumber(i)) {
                ++count;
            }
            if (count == 2) {
                System.out.println("Second prime number is: " + i);
                break;
            }
        }

    }
}
