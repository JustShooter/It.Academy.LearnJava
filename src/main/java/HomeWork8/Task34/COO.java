package main.java.HomeWork8.Task34;

public class COO extends Managers {
    // Операционный директор зарплата + бонус должности в %
    private double bonus = 25d; // Бонус в % к заплате за должность

    public COO(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }

    @Override
    public int setSalary() {
        salary = (int) ((getWageFund() * getPrecentOfWageFund() / 100) * ((bonus / 100) + 1));
        return salary;
    }

}
