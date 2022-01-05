package HomeWork17.Task43;

public class Task43 {
    public static void main(String[] args) {
        String str = null;
        try {
            if (str.equals("ABC")) {
                System.out.println("Test");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Причина возникновения исключения: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Continue working");
    }
}
