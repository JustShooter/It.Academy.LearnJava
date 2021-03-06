package HomeWork16.Task3.Model;

import java.util.Comparator;

public class ItemSortByName implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
