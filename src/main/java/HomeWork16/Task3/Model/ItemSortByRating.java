package main.java.HomeWork16.Task3.Model;

import java.util.Comparator;

public class ItemSortByRating implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getRating() - o2.getRating();
    }
}
