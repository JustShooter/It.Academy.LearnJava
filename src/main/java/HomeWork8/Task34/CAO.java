package HomeWork8.Task34;

public class CAO extends Bookkeeping {
    // Главный бухгалтер зарпалат + бонус должности в %
    private double bonus = 17d; // % к зарплате за должность

    public CAO(String name, int age, int workingHoursPerMonth, String position) {
        super(name, age, workingHoursPerMonth, position);
    }

    @Override
    public int setSalary() {
        salary = (int) (((this.workingHoursPerMonth * this.getHourlyRate()) + (getWageFund() * getPrecentOfWageFund() / 100)) / 2 * ((bonus / 100) + 1));
        return salary;
    }

}
