package HomeWork18.Task51.Service;

import HomeWork18.Task51.Model.PersonNames;
import HomeWork18.Task51.Model.PersonSurnames;

public class PersonServiceImpl implements PersonService {

    @Override
    public String createName() {
        return PersonNames.getPersonName(RANDOM.nextInt(NAMES_BOUND));
    }

    @Override
    public String createSurname() {
        return PersonSurnames.getPersonSurname(RANDOM.nextInt(NAMES_BOUND));
    }

    @Override
    public int createAge() {
        return RANDOM.nextInt(AGE_BOUND) + AGE_SHIFT;
    }
}
