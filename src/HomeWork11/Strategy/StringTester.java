package HomeWork11.Strategy;

public class StringTester implements TestSpeed {
    private String str;

    public StringTester(String str) {
        this.str = str;
    }

    @Override
    public long testSpeedOfMethod() {
        String s = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            s += this.str;
        }
        long finishTime = System.nanoTime();
        return (finishTime - startTime);
    }
}
