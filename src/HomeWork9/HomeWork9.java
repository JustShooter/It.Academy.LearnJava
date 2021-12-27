package HomeWork9;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Gruppa gruppa = new Gruppa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стандартное время необходимое для освоения навыка:");
        int slt = scanner.nextInt();
        gruppa.performGroupLearn(gruppa.createGroup(gruppa.setStudentsPerType(), slt));
    }
}
