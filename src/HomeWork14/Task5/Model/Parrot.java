package Task5.Model;

import Task5.Service.FlyByWings;
import Task5.Service.RepeatAnyVoice;

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
