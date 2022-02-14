package HomeWork18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task49 {

    public static final int BOUND = 255;
    public static final Random RANDOM = new Random();
    public static final int INT_COUNT = 20;

    public static void main(String[] args) {
        List<Integer> list = createList();
        File file = createFIle();
        fillList(list);
//        writeFile(list, file);
//        readFile(file);

        writeListInFile(list, file);

        List<Integer> listInput = getListFromFile(file);

        printList(listInput);

    }

    private static List<Integer> createList() {
        return new ArrayList<>();
    }

    private static File createFIle() {
        File file = new File("task49");
        file.deleteOnExit();
        return file;
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < INT_COUNT; i++) {
            list.add(RANDOM.nextInt(BOUND));
        }
    }

    private static void writeListInFile(List<Integer> list, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> getListFromFile(File file) {
        List<Integer> listInput = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            listInput = (List<Integer>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listInput;
    }

    private static void printList(List<Integer> listInput) {
        listInput.forEach(System.out::println);
        System.out.println("Среднее арифметическое:");
        System.out.println(listInput.stream().reduce(0, Integer::sum));
    }

    private static void readFile(File file) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int sum = 0;

            for (int i = 0; i < INT_COUNT; i++) {
                int buff = dis.readInt();
                System.out.print(buff + " ");
                sum += buff;
            }
            System.out.println("\nСреднее арифметическое:");
            System.out.println(sum / INT_COUNT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(List<Integer> list, File file) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {

            for (Integer integer : list) {
                dos.writeInt(integer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
