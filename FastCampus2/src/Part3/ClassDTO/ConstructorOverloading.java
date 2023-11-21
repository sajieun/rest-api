package Part3.ClassDTO;

import Part3.model.PersonVO2;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 셍성자 메서드를 통해 PersonVO2에 원하는 이름, 나이, 전화번호를 출력 하시오
        PersonVO2 vo = new PersonVO2();
        PersonVO2 vo1 = new PersonVO2("jieun",20,"010-5433-3456");

    }
}
