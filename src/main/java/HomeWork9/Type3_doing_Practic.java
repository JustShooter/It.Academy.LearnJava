package main.java.HomeWork9;

public class Type3_doing_Practic implements Learningable {
    private static final double TYPE3 = 3.0;

    @Override
    public void learning(int slt, double talent) {
        double lt = makeRound2((slt / talent) * TYPE3);
        System.out.println("Студент 3-го типа с талантом " + talent + " освоит материал за " + lt + " часов,");
        System.out.println("потратив на практику " + lt + " часов.");
    }

    public double makeRound2(double x) {
        return Math.round(x * 10) / 10.0;
    }
}
