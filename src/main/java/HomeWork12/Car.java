package main.java.HomeWork12;

public class Car<T extends Engine> {
    private final T engine;
    String model;

    @SuppressWarnings("unchecked")
    public Car(Engine engine, String model) {
        this.engine = (T) engine;
        this.model = model;
    }


    public void checkCar() {
        System.out.println("Car model is " + model);
        System.out.println("Engine type is " + engine.getClass().getName());
        System.out.println("Engine power is " + engine.getPower());
        engine.working();
        engine.fill();
        if (engine instanceof Electric) {
            ((Electric) engine).charge();
        }
    }
}
