package HomeWork18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task50 {
    public static final int SUBFOLDER_CHAIN_COUNT = 3;
    public static final String SUBFOLDER_NAME = "/Task50";
    public static final String FILE_NAME = "Task50";
    public static final int NUMBER_OF_FILES = 5;
    public static final String FILE_EXTENSION = ".txt";
    public static final int BOUND = 255;
    public static final Random RANDOM = new Random();
    public static final int INT_COUNT = 10;

    public static void main(String[] args) {

        Path path = createFolders();
        writeFiles(path);


        File readPath = new File(String.valueOf(path));
        File[] filesList = readPath.listFiles();
        List<String> filesNames = new ArrayList<>();
        Scanner sc = null;
        List<Integer> integerList = new ArrayList<>();
        for (File file : filesList) {
            filesNames.add(file.getName());
//            System.out.println("File name: " + file.getName());
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int input;
            while (sc.hasNextInt()) {
                input = sc.nextInt();
                integerList.add(input);
            }
        }
//        System.out.println(integerList);
        writeFile(integerList, new File(path + File.separator + FILE_NAME + FILE_EXTENSION));
        writeFile(filesNames, new File(path + File.separator + FILE_NAME + "_files_list" + FILE_EXTENSION));

    }


    private static void writeFiles(Path path) {
        File[] files = new File[NUMBER_OF_FILES];
        for (int i = 0; i < files.length; i++) {
            files[i] = new File(path + File.separator + FILE_NAME + "_" + (i + 1) + FILE_EXTENSION);
//            System.out.println(files[i].getAbsolutePath());
            writeFile(createAndFillList(), files[i]);
        }
    }

    private static Path createFolders() {
        Path path = Paths.get(String.valueOf(getPath()));
//        System.out.println(path);
        new File(String.valueOf(path)).mkdirs();
        return path;
    }

    private static void writeFile(List list, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Object o : list) {
                bufferedWriter.write(String.valueOf(o));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> createAndFillList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < INT_COUNT; i++) {
            list.add(RANDOM.nextInt(BOUND));
        }
        return list;
    }

    private static StringBuilder getPath() {
        StringBuilder pathBuild = new StringBuilder();
        for (int i = 1; i <= SUBFOLDER_CHAIN_COUNT; i++) {
            pathBuild.append(Paths.get(SUBFOLDER_NAME + "_" + i));
        }
        return pathBuild;
    }
}
