package HomeWork13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task41 {
    private List<Integer> marks;
    private static final int GROUPSIZE = 15;

    public Task41() {
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

    public void printHigherMark() {
        Iterator iterator = marks.iterator();
        int glass1, glass2 = 0;
        while (iterator.hasNext()) {
            glass1 = (int) iterator.next();
            if (glass2 < glass1) glass2 = glass1;
        }
        System.out.println("Highest mark is: " + glass2);
    }


    public void printMarks(ArrayList<Integer> marks) {
        Iterator iterator = marks.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Task41 task41 = new Task41();
        task41.fillRandomMarks();
        task41.printMarks(task41.getMarks());
        task41.printHigherMark();
    }

}
