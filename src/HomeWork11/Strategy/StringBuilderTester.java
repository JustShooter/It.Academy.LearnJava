package HomeWork11.Strategy;

public class StringBuilderTester implements TestSpeed {
    private StringBuilder strB;

    public StringBuilderTester(StringBuilder strB) {
        this.strB = strB;
    }

    @Override
    public long testSpeedOfMethod() {
        StringBuilder s = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            s.append(this.strB);
        }
        long finishTime = System.nanoTime();
        return (finishTime - startTime);
    }
}
