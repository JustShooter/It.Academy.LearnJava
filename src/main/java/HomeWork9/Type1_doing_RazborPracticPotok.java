package HomeWork9;

public class Type1_doing_RazborPracticPotok implements Learningable {
    private static final double TYPE1 = 3.0;

    @Override
    public void learning(int slt, double talent) {
        double lt = makeRound2(slt / talent);
        double pl = makeRound3(lt / TYPE1);
        System.out.println("Студент 1-го типа с талантом " + talent + " освоит материал за " + lt + " часов,");
        System.out.println("потратив на практику " + pl + " часов," + " потратив на разборы " + pl + " часов," + " потратив на поток " + pl + " часов.");
    }

    public double makeRound2(double x) {
        return Math.round(x * 10) / 10.0;
    }

    public double makeRound3(double x) {
        return Math.round(x * 100) / 100.0;
    }

}
