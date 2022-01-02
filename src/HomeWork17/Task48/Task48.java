package HomeWork17.Task48;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) {
        File file = createFile();
        fillFileWithNumbersString(file);
        StringBuilder str = getFileContend(file);
        System.out.println(str);
        printNumbers(str);
        System.out.println("Sum of all numbers in file is " + countNumbers(str));
        str = removeSameNumbers(str);
        printNumbers(str);
    }

    private static File createFile() {
        File file = new File("Task48.txt");
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

    private static void fillFileWithNumbersString(File file) {
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file.getName());
            bw = new BufferedWriter(writer);
            bw.write("This is 22 string 4866 4 8 with 22 48 66 25 numbers, 11 any 22 numbers 95 8 1");
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

    public static void printNumbers(StringBuilder str) {
        Pattern p = Pattern.compile("\\d++");
        Matcher m = p.matcher(str);
//        Set<Integer> set = new LinkedHashSet<>();
        while (m.find()) {
            System.out.print(m.group() + " ");
//            set.add(Integer.valueOf(m.group()));
        }
        System.out.println();
/*        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
    }

    public static int countNumbers(StringBuilder str) {
        Pattern p = Pattern.compile("\\d++");
        Matcher m = p.matcher(str);
        int glass = 0;
//        Set<Integer> set = new LinkedHashSet<>();
        while (m.find()) {
            glass += Integer.parseInt(m.group());
//            set.add(Integer.valueOf(m.group()));
        }
/*        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        return glass;
    }

    public static StringBuilder removeSameNumbers(StringBuilder str) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\d++");
        Matcher m = p.matcher(str);
        Set<Integer> set = new LinkedHashSet<>();
        while (m.find()) {
            set.add(Integer.valueOf(m.group()));
        }
        for (Integer integer : set) {
            sb.append(integer).append(" ");
        }
        return sb;
    }

}
