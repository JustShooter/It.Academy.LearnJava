package main.java.HomeWork8.Task34;

public class CTO extends Workers {
    // Ничальник цеха (типа) зарплата + бонус должности в %
    private double bonus = 15d; // % к зарплате за должность

    public CTO(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }

    @Override
    public int setSalary() {
        salary = (int) (this.workingHoursPerMonth*this.getHourlyRate()*((bonus/100)+1));
        return salary;
    }
}
