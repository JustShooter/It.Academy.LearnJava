package main.java.HomeWork15.Model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGroupNumber() == o2.getGroupNumber()){
            return (int) (o1.getAvgMarks(o1) - o2.getAvgMarks(o2));
        } else {
            return o1.getGroupNumber() - o2.getGroupNumber();
        }
    }
}
