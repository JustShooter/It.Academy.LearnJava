package HomeWork14.Task5.Model;

import HomeWork14.Task5.Service.CatVoice;
import HomeWork14.Task5.Service.RunByPaws;

public class Cat extends Pet {
    public Cat(int weight) {
        super(weight);
        moveBehavior = new RunByPaws();
        voiceBehavior = new CatVoice();
    }

    @Override
    public void display() {
        System.out.println("Im cat!");
    }
}
