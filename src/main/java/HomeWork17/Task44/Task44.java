package HomeWork17.Task44;

public class Task44 {
    public static void main(String[] args) {
        try {
            add();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    public static void add() throws MyException {
        System.out.println("Ну вот опять...");
        throw new MyException();
    }

}
