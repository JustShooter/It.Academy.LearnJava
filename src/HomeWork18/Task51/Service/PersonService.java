package HomeWork18.Task51.Service;

import java.util.Random;

public interface PersonService {
    Random RANDOM = new Random();
    int NAMES_BOUND = 20;
    int AGE_BOUND = 50;
    int AGE_SHIFT = 14;

    String createName();

    String createSurname();

    int createAge();
}
