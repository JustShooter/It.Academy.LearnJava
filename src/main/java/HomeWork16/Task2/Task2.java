package HomeWork16.Task2;

import HomeWork16.Task2.Model.NewHeavyBox;
import HomeWork16.Task2.Service.NewHeavyBoxService;
import HomeWork16.Task2.Service.NewHeavyBoxServiceImp;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        NewHeavyBoxService heavyBoxService = new NewHeavyBoxServiceImp();
        Set<NewHeavyBox> heavyBoxes = fillSet(heavyBoxService);
        heavyBoxService.printSet(heavyBoxes);
    }

    public static Set<NewHeavyBox> fillSet(NewHeavyBoxService heavyBoxService) {
        Set<NewHeavyBox> heavyBoxes = new TreeSet<>();
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(20, 25));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(12, 16));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(20, 28));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(12, 18));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(11, 19));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(28, 32));
        heavyBoxes.add(heavyBoxService.createNewHeavyBox(11, 14));
        return heavyBoxes;
    }
}
