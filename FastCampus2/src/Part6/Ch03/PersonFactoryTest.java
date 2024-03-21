package Part6.Ch03;

import Part5.model.Person;
import Part6.Ch03.model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
//        PersonFactory personFactory = Person::new;
//        Person person = personFactory.create("지은",25);
//        System.out.println(person);

//        interface 직접 구현
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name,age);
            }
        };
        Person person = personFactory.create("지은",25);
        System.out.println(person);
    }
}
