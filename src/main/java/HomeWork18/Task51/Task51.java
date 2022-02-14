package HomeWork18.Task51;

import HomeWork18.Task51.Model.Person;
import HomeWork18.Task51.Service.PersonService;
import HomeWork18.Task51.Service.PersonServiceImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task51 {

    public static final int PEOPLE_COUNT = 10;
    public static final String FILE_NAME = "task51";

    public static void main(String[] args) {
        List<Person> personList = getPersonList();
        File file = createFIle();
        printList(personList);
        writeListInFile(personList, file);
        List<Person> personInputList = getListFromFile(file);
        System.out.println();
        printList(personInputList);

    }

    private static void printList(List<Person> personList) {
        personList.forEach(System.out::println);
    }

    private static List<Person> getListFromFile(File file) {
        List<Person> listInput = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    listInput.add((Person) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listInput;
    }

    private static void writeListInFile(List<Person> list, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Object o : list) {
                oos.writeObject(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File createFIle() {
        File file = new File(FILE_NAME);
        file.deleteOnExit();
        return file;
    }

    private static List<Person> getPersonList() {
        PersonService service = new PersonServiceImpl();
        return Stream.generate(() -> new Person(service.createName(),
                        service.createSurname(),
                        service.createAge()))
                .limit(PEOPLE_COUNT)
                .toList();
    }
}
