package HomeWork9;

public class Type2_doing_PracticRazbor implements Learningable {
    private static final double TYPE2 = 2.0;

    @Override
    public void learning(int slt, double talent) {
        double lt = makeRound2((slt / talent) * TYPE2);
        double pl = makeRound3(lt / TYPE2);
        System.out.println("Студент 2-го типа с талантом " + talent + " освоит материал за " + lt + " часов,");
        System.out.println("потратив на практику " + pl + " часов," + " потратив на разборы " + pl + " часов.");
    }

    public double makeRound2(double x) {
        return Math.round(x * 10) / 10.0;
    }

    public double makeRound3(double x) {
        return Math.round(x * 100) / 100.0;
    }
}
