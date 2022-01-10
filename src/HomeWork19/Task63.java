package HomeWork19;

import java.util.List;
import java.util.Random;

public class Task63 {
    public static int n = 50;
    public static int minValue = 3;
    public static int maxValue = 66;
    public static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = random.ints(minValue, (maxValue + 1))
                .limit(n)
                .boxed()
                .toList();

        list.stream()
                .filter(value -> value % 3 == 0 && value % 5 == 0)
                .forEach(System.out::println);

    }
}
