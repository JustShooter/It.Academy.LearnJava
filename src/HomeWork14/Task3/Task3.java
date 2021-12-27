package Task3;

import Task3.Model.Product;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        fillMap(toys);
        printMapEntrySet(toys);
        printMapKeySet(toys);
        printMapValues(toys);
        printMapToString(toys);
    }

    private static void fillMap(Map<String, Product> toys) {
        toys.put("Bear", createProduct(12, 22));
        toys.put("Rabbit", createProduct(9, 12));
        toys.put("Santa", createProduct(6, 9));
        toys.put("Deer", createProduct(15, 32));
        toys.put("Locomotive", createProduct(18, 58));
    }

    private static void printMapToString(Map<String, Product> toys) {
        System.out.println(toys.toString());
    }

    private static void printMapValues(Map<String, Product> toys) {
        System.out.println(toys.values());
    }

    private static void printMapKeySet(Map<String, Product> toys) {
        System.out.println(toys.keySet());
    }

    private static void printMapEntrySet(Map<String, Product> toys) {
        System.out.println(toys.entrySet());
    }

    private static Product createProduct(int size, int price) {
        return new Product(size, price);
    }
}
