package HomeWork10;

public enum Seasons {
    WINTER("Зима", 90),
    SPRING("Весна", 92),
    SUMMER("Лето", 92),
    AUTUMN("Осень", 91);
    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
