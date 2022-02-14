package main.java.HomeWork9;

public class RandomTalent {
    public static double getRandomTalent() {
        double talent = Math.round((Math.random()) * 10) / 10.0;
        if (talent == 0) {
            talent = 0.1;
        }
        return talent;
    }
}
