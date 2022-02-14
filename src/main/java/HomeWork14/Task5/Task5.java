package HomeWork14.Task5;

import HomeWork14.Task5.Model.Cat;
import HomeWork14.Task5.Model.Dog;
import HomeWork14.Task5.Model.Parrot;
import HomeWork14.Task5.Model.Pet;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, Pet> homePets = new HashMap<>();
        homePets.put("Jack", new Dog(15));
        homePets.put("Bobik", new Dog(20));
        homePets.put("Murka", new Cat(10));
        homePets.put("Barsik", new Cat(12));
        homePets.put("Gosha", new Parrot(1));
        homePets.put("Zhora", new Parrot(2));

        printPets(homePets);

        printKeySet(homePets);
        printEntrySet(homePets);
    }

    private static void printPets(Map<String, Pet> homePets) {
        for (Pet pet : homePets.values()) {
            pet.display();
            System.out.println("My weight is " + pet.getWeight() + " kg");
            pet.performMove();
            pet.performVoice();
        }
    }

    private static void printEntrySet(Map<String, Pet> homePets) {
        System.out.println(homePets.entrySet());
    }

    private static void printKeySet(Map<String, Pet> homePets) {
        System.out.println(homePets.keySet());
    }
}
