package HomeWork9;

import HomeWork9.Learningable;

public abstract class Students implements Learningable {
    private double talent;
    private int slt;
    private int studentType;
    protected Learningable learningable;

    public Students(int slt, int studentType) {
        this.talent = RandomTalent.getRandomTalent();
        this.slt = slt;
        this.studentType = studentType;
        switch (studentType) {
            case 1:
                learningable = new Type1_doing_RazborPracticPotok();
                break;
            case 2:
                learningable = new Type2_doing_PracticRazbor();
                break;
            case 3:
                learningable = new Type3_doing_Practic();
                break;
            default:
                System.out.println("Wrong student type!!!");
        }
    }

    public void performLearn() {
        learningable.learning(slt, this.talent);
    }

}
