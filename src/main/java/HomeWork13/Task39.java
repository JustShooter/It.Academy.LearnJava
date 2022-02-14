package main.java.HomeWork13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task39 {

    public static final int MINIMUM_POSITIVE_MARK = 5;
    private final List<Integer> marks;
    private static final int GROUPSIZE = 15;

    public Task39() {
        this.marks = new ArrayList<>();
    }

    public ArrayList<Integer> getMarks() {
        return (ArrayList<Integer>) marks;
    }

    public void fillRandomMarks() {
        for (int i = 0; i < GROUPSIZE; i++) {
            this.marks.add(getRandomMarks());
        }
    }

    public int getRandomMarks() {
        return (int) (((Math.random() * 100) + 10) / 10);
    }

    public void removeBadMarks() {
        Iterator iterator = marks.iterator();
        while (iterator.hasNext()) {
            if ((int) iterator.next() < MINIMUM_POSITIVE_MARK) {
                iterator.remove();
            }
        }
    }

    public void printMarks(ArrayList<Integer> marks) {
        Iterator iterator = marks.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Task39 task39 = new Task39();
        task39.fillRandomMarks();
        task39.printMarks(task39.getMarks());
        task39.removeBadMarks();
        task39.printMarks(task39.getMarks());
    }

}
