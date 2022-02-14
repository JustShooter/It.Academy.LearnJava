package homeWork22.task70.model;

import java.time.LocalDate;

public class Man {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String secret = "Secret info";

    public Man(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public int getYearOfBirth() {
        return LocalDate.now().minusYears(this.age).getYear();
    }

    public String getFullNameAndAge() {
        return String.format("Mr %s %s aged %d years", this.firstName, this.lastName, this.age);
    }

}
