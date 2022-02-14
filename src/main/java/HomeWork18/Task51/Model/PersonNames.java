package HomeWork18.Task51.Model;

import java.util.ArrayList;
import java.util.List;

public final class PersonNames {
    private final static List<String> NAMES_LIST = fillList();

    public static String getPersonName(int i) {
        return NAMES_LIST.get(i);
    }

    private static List<String> fillList() {
        List<String> namesList = new ArrayList<>();
        namesList.add("Вася");
        namesList.add("Гриша");
        namesList.add("Лёня");
        namesList.add("Павел");
        namesList.add("Саша");
        namesList.add("Юра");
        namesList.add("Максим");
        namesList.add("Ваня");
        namesList.add("Руслан");
        namesList.add("Андрей");
        namesList.add("Сергей");
        namesList.add("Кирилл");
        namesList.add("Дима");
        namesList.add("Коля");
        namesList.add("Вадим");
        namesList.add("Виталик");
        namesList.add("Ян");
        namesList.add("Денис");
        namesList.add("Рома");
        namesList.add("Вова");
        return namesList;
    }

}
