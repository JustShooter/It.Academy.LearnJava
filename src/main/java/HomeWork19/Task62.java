package main.java.HomeWork19;

import main.java.HomeWork18.Task51.Model.Person;
import main.java.HomeWork18.Task51.Service.PersonService;
import main.java.HomeWork18.Task51.Service.PersonServiceImpl;

import java.util.Comparator;
import java.util.stream.Stream;

public class Task62 {
    public static void main(String[] args) {
        PersonService service = new PersonServiceImpl();
        Stream.generate(() -> new Person(service.createName(),
                        service.createSurname(),
                        service.createAge()))
                .filter(person -> person.getAge() > 15 && person.getAge() < 30)
                .limit(100)
                .peek(person -> {
                    if (person.getAge() < 21) System.out.println(person);
                })
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .toList()
                .forEach(System.out::println);
    }
}
