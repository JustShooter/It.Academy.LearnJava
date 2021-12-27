package HomeWork11.Strategy;

public class SpeedTester {
    public static void main(String[] args) {
        StringTester st = new StringTester("aaabbbccc");
        StringBuilderTester stb = new StringBuilderTester(new StringBuilder("aaabbbccc"));
        System.out.println(st.convertNanoToSec(st.testSpeedOfMethod()) + " sec");
        System.out.println(stb.convertNanoToSec(stb.testSpeedOfMethod()) + " sec");

    }
}
