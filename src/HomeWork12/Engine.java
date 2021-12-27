package HomeWork12;

public abstract class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void working() {
        System.out.println("Engine is working");
    }

    public abstract void fill();

}
