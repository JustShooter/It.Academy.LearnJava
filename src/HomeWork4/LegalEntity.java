package HomeWork4;

public class LegalEntity {
    private byte tax;
    private int income;

    public LegalEntity(byte tax) {
        this.tax = tax;
        income = 0;
    }

    public void setIncome(int income) {
        this.income = income;
    }


    public byte getTax() {
        return tax;
    }

    public int getIncome() {
        return income;
    }

    public float getNetProfit() {
        return ((float) income - ((float) income / 100) * tax);
    }

    public float getTaxValue() {
        return ((float) income / 100) * tax;
    }
}
