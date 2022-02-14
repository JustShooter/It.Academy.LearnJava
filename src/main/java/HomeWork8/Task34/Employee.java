package main.java.HomeWork8.Task34;

public class Employee extends Factory {
    protected String name;
    protected int age;
    protected int workingHoursPerMonth;
    protected String position;
    protected int salary;

    public Employee(String name, int age, int workingHoursPerMonth, String position) {
        this.name = name;
        this.age = age;
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.position = position;
    }

    public int setSalary() {
        return salary;
    }

    public void getSalary() {
        System.out.println(name + " aged " + age + " on position " + position + " has salary " + setSalary());
    }

}
