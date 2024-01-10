package Part4;

import Part4.model.Animal;
import Part4.model.Cat;
import Part4.model.Dog;

public class ObjectCastingTest {
    public static void main(String[] args) {
        // Animal ---> Dog, Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

//        ani.night() ---> 다운캐스팅 이 코드는 동작을 안 함
//        Cat c = (Cat)ani;  ---> 이렇게 두 줄을 한 줄로 하게끔
//        c.night();
//        한 줄
        ((Cat)ani).night(); // --> 다운캐스팅 적용

    }
}