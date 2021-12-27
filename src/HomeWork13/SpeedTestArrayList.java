package HomeWork13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTestArrayList {
    public static final int INDEX_FOR_ADD = 2;
    public static final double NANO_TO_SECONDS_RATIO = 1000000000d;
    private List<Integer> list;
    private static final int LIST_SIZE = 1_000_000;

    public SpeedTestArrayList(List<Integer> list) {
        this.list = list;
    }


    public double fillRandomList() {
        long startTime = getTime();
        for (int i = 0; i < LIST_SIZE; i++) {
            this.list.add(getRandomNumbers());
        }
        long finishTime = getTime();
        return getTimeInSeconds(startTime, finishTime);
    }

    public double fillRandomListIntoMiddle() {
        clearList();
        long startTime = getTime();
        for (int i = 0; i < LIST_SIZE; i++) {
            if (this.list.size() >= INDEX_FOR_ADD) {
                this.list.add((this.list.size() / 2), getRandomNumbers());
            } else {
                this.list.add(getRandomNumbers());
            }
        }
        long finishTime = getTime();
        return getTimeInSeconds(startTime, finishTime);
    }

    private double getTimeInSeconds(long startTime, long finishTime) {
        return (finishTime - startTime) / NANO_TO_SECONDS_RATIO;
    }

    private long getTime() {
        return System.nanoTime();
    }

    private void clearList() {
        this.list.clear();
    }

    public int getRandomNumbers() {
        return (int) (Math.random() * 1000);
    }

    public double testGetArrayListInOrder() {
        long startTime = getTime();
        for (int i = 0; i < this.list.size(); i++) {
            this.list.get(i);
        }
        long finishTime = getTime();
        return getTimeInSeconds(startTime, finishTime);
    }

    public double testGetArrayListRandom() {
        long startTime = getTime();
        for (int i = 0; i < LIST_SIZE; i++) {
            this.list.get((int) (Math.random() * LIST_SIZE));
        }
        long finishTime = getTime();
        return getTimeInSeconds(startTime, finishTime);
    }

    public double testDeleteInMiddleOfList() {
        long startTime = getTime();
        for (int i = 0; i < LIST_SIZE / 5; i++) {
            this.list.remove(this.list.size() / 2);
        }
        long finishTime = getTime();
        return getTimeInSeconds(startTime, finishTime);
    }

    public static void main(String[] args) {
        SpeedTestArrayList test1 = new SpeedTestArrayList(new ArrayList<>());
        System.out.println("Fill ArrayList with random numbers in order");
        System.out.println(test1.fillRandomList() + " sec");
/*        System.out.println("Fill ArrayList with random numbers in the middle of ArrayList");
        System.out.println(test1.fillRandomListIntoMiddle() + " sec");
        System.out.println("Lets test get function of ArrayList in order");
        System.out.println(test1.testGetArrayListInOrder() + " sec");
        System.out.println("Lets test get function of ArrayList in random");
        System.out.println(test1.testGetArrayListRandom() + " sec");*/
        System.out.println("Lets delete 500.000 list objects in middle of list");
        System.out.println(test1.testDeleteInMiddleOfList() + " sec");

        SpeedTestArrayList test2 = new SpeedTestArrayList(new LinkedList<>());
        System.out.println("Fill LinkedList with random numbers in order");
        System.out.println(test2.fillRandomList() + " sec");
/*        System.out.println("Fill LinkedList with random numbers in the middle of LinkedList");
        System.out.println(test2.fillRandomListIntoMiddle() + " sec");
        System.out.println("Lets test get function of LinkedList in order");
        System.out.println(test2.testGetArrayListInOrder() + " sec");
        System.out.println("Lets test get function of LinkedList in random");
        System.out.println(test2.testGetArrayListRandom() + " sec");*/
        System.out.println("Lets delete 500.000 list objects in middle of list");
        System.out.println(test2.testDeleteInMiddleOfList() + " sec");

    }

}
