package main.java.HomeWork8.Task34;

public class Bookkeeping extends Employee {
    // смешанная оплата труда (не совсем понимаю как это должно работать)


    public Bookkeeping(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }

    @Override
    public int setSalary() {
        salary = ((int) ((this.workingHoursPerMonth * this.getHourlyRate()) + (getWageFund() * getPrecentOfWageFund() / 100)) / 2);
        return salary;
    }
}
