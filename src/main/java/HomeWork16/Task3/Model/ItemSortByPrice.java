package main.java.HomeWork16.Task3.Model;

import java.util.Comparator;

public class ItemSortByPrice implements Comparator<Item> {

    public static final int BETTER_PRICE_COMPARE_MULTIPLIER = 100;

    @Override
    public int compare(Item o1, Item o2) {
        return (int) ((o1.getPrice() * BETTER_PRICE_COMPARE_MULTIPLIER) - (o2.getPrice() * BETTER_PRICE_COMPARE_MULTIPLIER));
    }
}
