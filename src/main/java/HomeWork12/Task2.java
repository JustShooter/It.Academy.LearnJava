package main.java.HomeWork12;

public class Task2 {
    public static void main(String[] args) {
        Firm firm = new Firm();
        Firm.Subsidiary subFirm = new Firm.Subsidiary(22, 1600);
        Firm.SalesDepartment salesDepartment = new Firm.SalesDepartment(12, 1200);
        firm.setProfit(subFirm.getSubsidiaryProfit() + salesDepartment.getOfficeProfit());
        firm.setWorkers(subFirm.getSubsidiaryWorkers() + salesDepartment.getOfficeWorkers());
        System.out.printf("\nTotal firm profit is %d rubles", firm.getProfit());
        System.out.printf("\nTotal firm workers is %d peoples", firm.getWorkers());
    }
}
