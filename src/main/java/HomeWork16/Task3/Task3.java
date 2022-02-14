package main.java.HomeWork16.Task3;

import main.java.HomeWork16.Task3.Model.Item;
import main.java.HomeWork16.Task3.Model.ItemSortByName;
import main.java.HomeWork16.Task3.Model.ItemSortByPrice;
import main.java.HomeWork16.Task3.Model.ItemSortByRating;
import main.java.HomeWork16.Task3.Service.ItemService;
import main.java.HomeWork16.Task3.Service.ItemServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ItemService itemService = new ItemServiceImpl();
        List<Item> catalogue = fillList(itemService);
        itemService.printList(catalogue);
        itemService.printList(itemService.sortList(catalogue, new ItemSortByName()));
        itemService.printList(itemService.sortList(catalogue, new ItemSortByPrice()));
        itemService.printList(itemService.sortList(catalogue, new ItemSortByRating()));
    }

    public static List<Item> fillList(ItemService itemService) {
        List<Item> items = new ArrayList<>();
        items.add(itemService.createItem("Плоскогубцы", 4.54, 6));
        items.add(itemService.createItem("Круглогубцы", 3.96, 7));
        items.add(itemService.createItem("Бокорезы", 4.02, 7));
        items.add(itemService.createItem("Отвёртка", 2.67, 4));
        items.add(itemService.createItem("Напильник", 3.21, 3));
        items.add(itemService.createItem("Надфиль", 1.21, 8));
        items.add(itemService.createItem("Угольник", 3.71, 4));
        items.add(itemService.createItem("Угломер", 5.62, 9));
        items.add(itemService.createItem("Уровень", 12.55, 10));
        items.add(itemService.createItem("Ножовка", 9.58, 4));
        items.add(itemService.createItem("Лобзик", 7.12, 8));
        items.add(itemService.createItem("Стусло", 6.83, 3));
        items.add(itemService.createItem("Сверло", 1.02, 1));
        items.add(itemService.createItem("Рулетка", 5.77, 7));
        items.add(itemService.createItem("Молоток", 8.86, 5));
        items.add(itemService.createItem("Шпатель", 4.44, 4));
        return items;
    }

}
