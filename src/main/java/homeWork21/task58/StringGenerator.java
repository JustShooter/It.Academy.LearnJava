package homeWork21.task58;

import java.util.Random;

public class StringGenerator {

    public static final int START_CHAR_NUMBER = 97;
    public static final int LAST_CHAR_NUMBER = 122;
    public static final int STRING_LENGTH = 10;
    private final Random random = new Random();

    public synchronized String generateString() {

        System.out.printf("Generating random string line");
        StringBuffer buffer = new StringBuffer(STRING_LENGTH);
        for (int i = 0; i < STRING_LENGTH; i++) {
            int randomLimitedInt = START_CHAR_NUMBER
                    + (int) (random.nextFloat()
                    * (LAST_CHAR_NUMBER - START_CHAR_NUMBER
                    + 1));
            buffer.append((char) randomLimitedInt);
        }
        System.out.printf("Generated random string line is \"%s\"%n", buffer);
        return buffer.toString();
    }

}
