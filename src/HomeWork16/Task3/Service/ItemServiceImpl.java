package HomeWork16.Task3.Service;

import HomeWork16.Task3.Model.Item;

import java.util.Comparator;
import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public Item createItem(String name, double price, int rating) {
        return new Item(name, price, rating);
    }

    @Override
    public void printList(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }

    @Override
    public List<Item> sortList(List<Item> items, Comparator<Item> itemComparator) {
        items.sort(itemComparator);
        return items;
    }
}
