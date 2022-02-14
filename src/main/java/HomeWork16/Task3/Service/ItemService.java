package HomeWork16.Task3.Service;

import HomeWork16.Task3.Model.Item;

import java.util.Comparator;
import java.util.List;

public interface ItemService {
    Item createItem(String name, double price, int rating);

    void printList(List<Item> items);

    List<Item> sortList(List<Item> items, Comparator<Item> itemComparator);
}
