package main.java.HomeWork12;

public class Task1 {
    public static void main(String[] args) {
        Car<Gasoline> car1 = new Car(new Gasoline(120), "BMW");
        car1.checkCar();
        Car<Diesel> car2 = new Car(new Diesel(90), "Fiat");
        car2.checkCar();
        Car<Electric> car3 = new Car(new Electric(180), "Tesla");
        car3.checkCar();
    }
}
