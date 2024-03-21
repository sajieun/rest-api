package Part6.Ch03;

import Part5.model.Person;

public class IntergerUtilsTest {
    public static void main(String[] args) {
        Converter<String,Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");
        System.out.println("result = " + result);

        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("지은",25);
        System.out.println(person);


    }
}
