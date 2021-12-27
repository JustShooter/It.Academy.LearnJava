package HomeWork8.Task34;

public class Workers extends Employee {
    // почасовая оплата труда


    public Workers(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }


    @Override
    public int setSalary() {
        salary = this.workingHoursPerMonth*this.getHourlyRate();
        return salary;
    }
}
