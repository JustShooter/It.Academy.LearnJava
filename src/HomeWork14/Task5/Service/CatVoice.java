package Task5.Service;

public class CatVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("Meow!");
    }
}
