package Part3.ClassDTO;

import Part3.model.PersonVO2;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO2 pvo2 = new PersonVO2();
        System.out.println(pvo2.getName()+pvo2.getAge() +pvo2.getPhone());

    }
}
