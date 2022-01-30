package HomeWork14.Task5.Model;

import HomeWork14.Task5.Service.FlyByWings;
import HomeWork14.Task5.Service.RepeatAnyVoice;

public class Parrot extends Pet {
    public Parrot(int weight) {
        super(weight);
        voiceBehavior = new RepeatAnyVoice();
        moveBehavior = new FlyByWings();
    }

    @Override
    public void display() {
        System.out.println("Im parrot!");
    }
}
