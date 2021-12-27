package HomeWork4;

public class Booker {

    private static void printBalanceSheet(int a, float b, float c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        LegalEntity firma = new LegalEntity((byte) 16);
        OJSC oao = new OJSC((byte) 18, (byte) 5);
        firma.setIncome(1285);
        oao.setIncome(111);
        printBalanceSheet(firma.getIncome(), firma.getTaxValue(), firma.getNetProfit());
        printBalanceSheet(oao.getIncome(), oao.getTaxValue(), oao.getNetProfit());

    }

}
