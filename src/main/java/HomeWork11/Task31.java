package HomeWork11;

public class Task31 {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        StringBuilder strB = new StringBuilder(str);
        String tmp = "";
        StringBuilder tmpB = new StringBuilder();

        long firstStart = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            tmp += str;
        }
        long firstFinish = System.nanoTime();
        double firstDelta = firstFinish - firstStart;
        System.out.println("Скорость сложения String " + firstDelta / 1000000000 + " сек");

        long secondStart = System.nanoTime();
        tmpB.append(String.valueOf(strB).repeat(1000000));
        long secondFinish = System.nanoTime();
        double secondDelta = secondFinish - secondStart;
        System.out.println("Скорость работы метода append в StringBuilder " + secondDelta / 1000000000 + " сек");

        System.out.println("Соотношение производительности: " + firstDelta / secondDelta);
    }
}
