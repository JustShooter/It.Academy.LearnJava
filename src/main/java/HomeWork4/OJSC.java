package main.java.HomeWork4;

public class OJSC extends LegalEntity {

    private final byte road_tax;

    public OJSC(byte tax, byte road_tax) {
        super(tax);
        this.road_tax = road_tax;
    }

    @Override
    public float getNetProfit() {
        return ((float) getIncome() - (((float) getIncome() / 100) * getTax()) - (((float) getIncome() / 100) * road_tax));
    }

    @Override
    public float getTaxValue() {
        return (((float) getIncome() / 100) * getTax()) + (((float) getIncome() / 100) * road_tax);
    }


}
