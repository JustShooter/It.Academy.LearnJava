package HomeWork8.Task34;

public class Managers extends Employee {
    // процентная оплата труда

    public Managers(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }

    @Override
    public int setSalary() {
        salary = (int) (getWageFund()*getPrecentOfWageFund()/100);
        return salary;
    }

}
