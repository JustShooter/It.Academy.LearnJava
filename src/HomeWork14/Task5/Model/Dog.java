package HomeWork14.Task5.Model;

import HomeWork14.Task5.Service.DogVoice;
import HomeWork14.Task5.Service.RunByPaws;

public class Dog extends Pet {
    public Dog(int weight) {
        super(weight);
        moveBehavior = new RunByPaws();
        voiceBehavior = new DogVoice();
    }

    @Override
    public void display() {
        System.out.println("Im dog!");
    }
}
