package main.java.HomeWork13;

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        fillRandomNumbers(collection);
        printCollection(collection);
        removeSameNumbers(collection);
        printCollection(collection);
    }

    private static void fillRandomNumbers(List<Integer> collection) {
        for (int i = 0; i < 15; i++) {
            collection.add((int) (Math.random() * 10 + 1));
        }
    }

    private static void printCollection(List<Integer> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private static void removeSameNumbers(List<Integer> collection) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(collection);
        collection.clear();
        collection.addAll(set);
    }
}

