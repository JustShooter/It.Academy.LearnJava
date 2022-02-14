package main.java.HomeWork16.Task2.Service;

import main.java.HomeWork16.Task2.Model.NewHeavyBox;

import java.util.Set;

public class NewHeavyBoxServiceImp implements NewHeavyBoxService {

    @Override
    public NewHeavyBox createNewHeavyBox(int size, int weight) {
        return new NewHeavyBox(size, weight);
    }

    @Override
    public void printSet(Set<NewHeavyBox> heavyBoxes) {
        for (NewHeavyBox boxes : heavyBoxes) {
            System.out.println(boxes);
        }
    }
}
