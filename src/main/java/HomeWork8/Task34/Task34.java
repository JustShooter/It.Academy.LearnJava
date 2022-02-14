package main.java.HomeWork8.Task34;

public class Task34 {
    public static void main(String[] args) {
        Managers manager1 = new Managers("Ivan Ivanovich", 36, 140, "manager");
        manager1.getSalary();
        COO coo = new COO("Petr Petrovich", 51, 132, "COO");
        coo.getSalary();
        Workers worker1 = new Workers("Sidor Sidorovich", 46, 176, "mechanic");
        worker1.getSalary();
        CTO cto = new CTO("San Sanych", 53, 168, "foreman");
        cto.getSalary();
        Bookkeeping accountant = new Bookkeeping("Maria Ivanovna", 43, 153, "accountant");
        accountant.getSalary();
        CAO cao = new CAO("Galina Leopoldovna", 56, 152, "chief accountant");
        cao.getSalary();
    }
}
