package main.java.HomeWork19;

import java.util.stream.Stream;

public class Task61 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.print(x + " inch "))
                .map(x -> x * 2.54)
                .forEach(x -> System.out.println(x + " cm"));
    }
}
