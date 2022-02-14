package main.java.HomeWork8.Task24;

public class Task24 {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(1600);
        TimeInterval timeInterval1 = new TimeInterval(36, 25, 1);
        System.out.println(timeInterval.printTotalSec());
        System.out.println(timeInterval1.printTotalSec());
        System.out.println(timeInterval.compareTo(timeInterval1));
        System.out.println(timeInterval1.compareTo(timeInterval));
    }

}
