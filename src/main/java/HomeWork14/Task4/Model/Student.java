package main.java.HomeWork14.Task4.Model;

import java.util.Arrays;
import java.util.Objects;

public final class Student {
    private final String name;
    private final int groupNumber;
    private int kurs;
    private byte[] marks;

    public Student(final String name, final int groupNumber, final int kurs, final byte[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.kurs = kurs;
        this.marks = marks;
    }

    public Student(final String name, final int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getGroupNumber() {
        return this.groupNumber;
    }

    public int getKurs() {
        return this.kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public byte[] getMarks() {
        return this.marks;
    }

    public void setMarks(byte[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return this.groupNumber == student.groupNumber && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.groupNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", kurs=" + kurs +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
