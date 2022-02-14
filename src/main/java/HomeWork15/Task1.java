package HomeWork15;

import HomeWork15.Model.Student;
import HomeWork15.Model.StudentComparator;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Collection<Student> students = getCollection();
        printStudents(students);
        sortByList(students);
        sortByTreeSet(students);
    }

    private static void sortByTreeSet(Collection<Student> students) {
        Set<Student> studentTreeSet = new TreeSet<>(new StudentComparator());
        studentTreeSet.addAll(students);
        printStudents(studentTreeSet);
    }

    @SuppressWarnings("unchecked")
    private static void sortByList(Collection<Student> students) {
        List<Student> sortedList = new ArrayList<>(students);
        Collections.sort(sortedList);
        printStudents(sortedList);
    }

    private static Collection<Student> getCollection() {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Andrei", 920601, 3, new byte[]{1, 5, 6, 8, 7, 9}));
        students.add(new Student("Maksim", 920602, 2, new byte[]{8, 7, 4, 9, 7}));
        students.add(new Student("Vasiliy", 920601, 2, new byte[]{2, 3, 2, 3, 2, 4, 6, 1, 2}));
        students.add(new Student("Danila", 920602, 1, new byte[]{10, 9, 9, 8, 10, 9, 7}));
        students.add(new Student("Vlad", 920603, 1, new byte[]{8, 6, 3, 7, 10}));
        students.add(new Student("Aleksandr", 920602, 2, new byte[]{3, 7, 5, 4, 9, 5, 6}));
        students.add(new Student("Vadim", 920603, 2, new byte[]{1, 3, 2, 4, 2, 1}));
        students.add(new Student("Yan", 920602, 3, new byte[]{3, 3, 3, 2, 3}));
        return students;
    }

    private static void printStudents(Collection<Student> students) {
        for (Student studs : students) {
            System.out.println(studs);
        }
        System.out.println();
    }

}
