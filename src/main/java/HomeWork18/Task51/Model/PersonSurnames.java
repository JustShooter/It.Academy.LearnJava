package HomeWork18.Task51.Model;

import java.util.ArrayList;
import java.util.List;

public final class PersonSurnames {
    private final static List<String> SURNAMES_LIST = fillList();

    public static String getPersonSurname(int i) {
        return SURNAMES_LIST.get(i);
    }

    private static List<String> fillList() {
        List<String> namesList = new ArrayList<>();
        namesList.add("Иванов");
        namesList.add("Васильев");
        namesList.add("Петров");
        namesList.add("Смирнов");
        namesList.add("Михайлов");
        namesList.add("Фёдоров");
        namesList.add("Соколов");
        namesList.add("Яковлев");
        namesList.add("Попов");
        namesList.add("Андреев");
        namesList.add("Алексеев");
        namesList.add("Александров");
        namesList.add("Лебедев");
        namesList.add("Григорьев");
        namesList.add("Степанов");
        namesList.add("Семёнов");
        namesList.add("Павлов");
        namesList.add("Богданов");
        namesList.add("Николаев");
        namesList.add("Дмитриев");
        return namesList;
    }

}
