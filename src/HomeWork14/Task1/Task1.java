package HomeWork14.Task1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        Pattern p = Pattern.compile("[0-9]+?");
        Matcher m = p.matcher(stringBuilder);
        Set<Integer> set = new LinkedHashSet<>();
        while (m.find()) {
            set.add(Integer.valueOf(m.group()));
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
