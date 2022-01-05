/**
 * Кто подскажет, какой из двух указанных ниже, вариантов получения рабочей папки более правильный?
 * Через System.GetProperty или же через класс Paths?
 */
package HomeWork17.Task46;

import java.io.File;
import java.nio.file.Paths;
import java.util.Objects;

public class Task46 {
    public static void main(String[] args) {
        String currentPath = Paths.get("").toAbsolutePath().toString();
//        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);
        File dir = new File(currentPath);
        for (File list : Objects.requireNonNull(dir.listFiles())) {
            if (list.isDirectory()) {
                System.out.println(list.getName() + " \t папка");
            } else {
                System.out.println(list.getName() + " \t файл");
            }
        }
    }
}