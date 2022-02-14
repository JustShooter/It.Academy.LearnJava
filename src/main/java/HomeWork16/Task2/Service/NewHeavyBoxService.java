package HomeWork16.Task2.Service;

import HomeWork16.Task2.Model.NewHeavyBox;

import java.util.Set;

public interface NewHeavyBoxService {
    NewHeavyBox createNewHeavyBox(int size, int weight);

    void printSet(Set<NewHeavyBox> heavyBoxes);
}
