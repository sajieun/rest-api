package Part6.Ch03;

import Part5.model.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
