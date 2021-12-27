package Task5.Service;

public class RepeatAnyVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("I can repeat anything you say!");
    }
}
