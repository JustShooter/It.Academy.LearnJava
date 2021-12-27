package HomeWork11.Strategy;

public interface TestSpeed {
    long testSpeedOfMethod();

    default double convertNanoToSec(long nano) {
        return (nano / 1000000000);
    }

}
