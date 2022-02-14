package main.java.HomeWork12;

public class Electric extends Engine {

    public Electric(int power) {
        super(power);
    }

    public void fill() {
        System.out.println("Can not be filled with any liquid fuel");
    }

    public void charge() {
        System.out.println("Charge with electricity");
    }

}
