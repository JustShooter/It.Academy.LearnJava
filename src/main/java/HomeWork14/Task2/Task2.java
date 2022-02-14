package HomeWork14.Task2;

import HomeWork14.Task2.Model.HeavyBox;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = new LinkedList<>();
        HeavyBox heavyBox1 = new HeavyBox(3, 18);
        HeavyBox heavyBox2 = new HeavyBox(5, 22);
        HeavyBox heavyBox3 = new HeavyBox(2, 12);
        HeavyBox heavyBox4 = new HeavyBox(8, 24);
        heavyBoxList.add(heavyBox1);
        heavyBoxList.add(heavyBox2);
        heavyBoxList.add(heavyBox3);
        heavyBoxList.add(heavyBox4);
        printListForEach(heavyBoxList);
        heavyBox1.setWeight(1);
        heavyBoxList.remove(heavyBoxList.size() - 1);
        printListIterator(heavyBoxList);
        for (HeavyBox heavyBox : heavyBoxList) {
            System.out.println(heavyBox);
        }
        System.out.println(heavyBoxList);
        heavyBoxList.clear();
    }

    private static void printListIterator(List<HeavyBox> heavyBoxList) {
        Iterator<HeavyBox> itr = heavyBoxList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void printListForEach(List<HeavyBox> heavyBoxList) {
        for (HeavyBox h : heavyBoxList) {
            System.out.println(h.toString());
        }
    }
}
