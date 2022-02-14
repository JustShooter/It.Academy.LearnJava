package HomeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerMenu = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        System.out.println("Введите 1 - для использования заранее заготовленной строки, или любое другое число, для ввода своей строки.");
        int menu = scannerMenu.nextInt();
        if (menu == 1) s.append("Допустим это HTML <p> <p style=text-indent: 25px>  <p id=\"p1\">");
        else s.append(scannerString.nextLine());
        System.out.println(s);
        Pattern p = Pattern.compile("<p..+?>");
        Matcher m = p.matcher(s);
        System.out.println(m.replaceAll("<p>"));
    }
}
