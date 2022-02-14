package HomeWork14.Task4;

import HomeWork14.Task4.Model.Student;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Task4 {

    public static final double MINIMUM_AVG_MARK = 3.0;

    public static void main(String[] args) {
        Collection<Student> students = getCollection();

        printStudents(students);

        printStudentsOnKurs(students, 1);
        printStudentsOnKurs(students, 2);
        printStudentsOnKurs(students, 3);
        printStudentsOnKurs(students, 4);

        removeLowMarksStudents(students);

        printStudents(students);

        moveToNextKurs(students);
        printStudents(students);
        printStudentsOnKurs(students, 1);
        printStudentsOnKurs(students, 2);
        printStudentsOnKurs(students, 3);
        printStudentsOnKurs(students, 4);

    }

    private static Collection<Student> getCollection() {
        Collection<Student> students = new HashSet<>();
        students.add(new Student("Andrei", 920601, 3, new byte[]{1, 5, 6, 8, 7, 9}));
        students.add(new Student("Maksim", 920601, 2, new byte[]{8, 7, 4, 9, 7}));
        students.add(new Student("Vasiliy", 920601, 2, new byte[]{2, 3, 2, 3, 2, 4, 6, 1, 2}));
        students.add(new Student("Danila", 920601, 1, new byte[]{10, 9, 9, 8, 10, 9, 7}));
        students.add(new Student("Vlad", 920601, 1, new byte[]{8, 6, 3, 7, 10}));
        students.add(new Student("Dmitry", 920601, 1, new byte[]{3, 7, 5, 4, 9, 3, 5, 6}));
        students.add(new Student("Vadim", 920601, 2, new byte[]{1, 3, 2, 4, 2, 1}));
        students.add(new Student("Yan", 920601, 3, new byte[]{3, 3, 3, 2, 3}));
        return students;
    }

    private static void printStudentsOnKurs(Collection<Student> students, int kurs) {
        System.out.println("Students of kurs " + kurs + " is:");
        for (Student studs : students) {
            if (studs.getKurs() == kurs) {
                System.out.println(studs.getName());
            }
        }
    }

    private static void moveToNextKurs(Collection<Student> students) {
        for (Student studs : students) {
            double avgMarks = getAvgMarks(studs);
            if (avgMarks >= MINIMUM_AVG_MARK) {
                studs.setKurs(studs.getKurs() + 1);
            }
        }
    }

    private static void removeLowMarksStudents(Collection<Student> students) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            double avgMarks = getAvgMarks(itr.next());
            if (avgMarks < MINIMUM_AVG_MARK) {
                itr.remove();
            }
        }
    }

    private static double getAvgMarks(Student studs) {
        double avgMarks = 0.0;
        for (byte marks : studs.getMarks()) {
            avgMarks += marks;
        }
        avgMarks = avgMarks / studs.getMarks().length;
        return avgMarks;
    }

    private static void printStudents(Collection<Student> students) {
        for (Student studs : students) {
            System.out.println(studs);
        }
        System.out.println();
    }

}
