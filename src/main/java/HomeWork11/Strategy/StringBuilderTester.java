package main.java.HomeWork11.Strategy;

public class StringBuilderTester implements TestSpeed {
    private StringBuilder strB;

    public StringBuilderTester(StringBuilder strB) {
        this.strB = strB;
    }

    @Override
    public long testSpeedOfMethod() {
        StringBuilder s = new StringBuilder();
        long startTime = System.nanoTime();
        s.append(String.valueOf(this.strB).repeat(1000000));
        long finishTime = System.nanoTime();
        return (finishTime - startTime);
    }
}
