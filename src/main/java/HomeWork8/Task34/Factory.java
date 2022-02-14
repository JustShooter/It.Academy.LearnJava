package HomeWork8.Task34;

public class Factory {
    private final int factoryIncome = 2600000; // Доход завода
    private final int hourlyRate = 12; // Почасавой тариф
    private final double tax = 16;
    private final int wageFund = factoryIncome - (int) (factoryIncome / 100 * tax); // фонд оплаты труда (доход завода - %налога)
    private double precentOfWageFund = 0.32d; //Процент зарплаты в зависимости от дохода

    public int getWageFund() {
        return wageFund;
    }

    public int getFactoryIncome() {
        return factoryIncome;
    }


    public int getHourlyRate() {
        return hourlyRate;
    }

    public double getPrecentOfWageFund() {
        return precentOfWageFund;
    }

}
