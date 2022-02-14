package HomeWork9;

import java.util.Scanner;

public class Gruppa {
    private int studentsPerType;
    private static final int STUDENTTYPE1 = 1;
    private static final int STUDENTTYPE2 = 2;
    private static final int STUDENTTYPE3 = 3;

    public int setStudentsPerType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов каждого типа:");
        studentsPerType = scanner.nextInt();
        scanner.close();
        return studentsPerType;
    }

    public Student[] createGroup(int studentsPerType, int slt) {
        int totalStudents = studentsPerType * 3;
        Student[] gruppa = new Student[totalStudents];
        int tmp = 0;
        for (int i = 0; i < studentsPerType; i++) {
            Student s = new Student(slt, STUDENTTYPE1);
            gruppa[i] = s;
        }
        tmp += studentsPerType;
        for (int i = tmp; i < tmp + studentsPerType; i++) {
            Student s = new Student(slt, STUDENTTYPE2);
            gruppa[i] = s;
        }
        tmp += studentsPerType;
        for (int i = tmp; i < totalStudents; i++) {
            Student s = new Student(slt, STUDENTTYPE3);
            gruppa[i] = s;
        }
        return gruppa;
    }

    public void performGroupLearn(Student[] gruppa) {
        for (Student student : gruppa) {
            student.performLearn();
        }
    }

}
