package homeWork22.task72.model;

import homeWork22.task72.annotations.AcademyInfo;

public class UtilityAnnotation {

    @AcademyInfo(year = 2022)
    public void printHello() {
        System.out.println("Hello");
    }

    public void printHi() {
        System.out.println("Hi");
    }
}
