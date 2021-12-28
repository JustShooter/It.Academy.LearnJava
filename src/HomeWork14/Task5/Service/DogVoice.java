package Task5.Service;

public class DogVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("Woof!");
    }
}
