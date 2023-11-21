package Part3.ClassDTO;

import Part3.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO pvo = new PersonVO();
        pvo.setName("sajieun");
        pvo.setAge(5);
        pvo.setPhone("010-5555-5555");

        System.out.println(pvo.getName()+pvo.getAge()+pvo.getPhone());
    }
}
