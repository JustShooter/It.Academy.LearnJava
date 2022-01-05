package HomeWork17.Task47;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) {
        File file = createFile();
        fillFileWithTextString(file);
        StringBuilder str = getFileContend(file);
        System.out.println(str);
        System.out.println("Количество слов в файле " + file.getName() + " " + countWords(str.toString()) + " шт.");
        System.out.println("Количество знаков препинания в файле " + file.getName() +
                " " + countPunctMarks(str.toString()) + " шт.");
    }

    private static File createFile() {
        File file = new File("Task47.txt");
        file.deleteOnExit();
        if (!file.exists()) {
            try {
                if (file.createNewFile()) System.out.println("Creating new file " + file.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private static void fillFileWithTextString(File file) {
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file.getName());
            bw = new BufferedWriter(writer);
            bw.write("This is, the temporary ! string ! line, so, we need to count words, and punctuation marks.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static StringBuilder getFileContend(File file) {
        StringBuilder str = new StringBuilder();
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file.getName());
            br = new BufferedReader(reader);
            while (br.ready()) {
                str.append(br.readLine());
            }
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }

    public static int countWords(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[A-Za-zА-Яа-я]{2,}"); // Слово должно содержать не менее 2 букв
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int countPunctMarks(String str) {
        int zp = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '!' && str.charAt(i) <= '.') || (str.charAt(i) >= ':' && str.charAt(i) <= '?')) {
                zp += 1;
            }
        }
        return zp;
    }

}
