package Part4;

import Part4.model.Animal;
import Part4.model.Cat;
import Part4.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        Animal ai = new Dog();
        ai.eat(); // Animal --(동적바인딩)-->Dog

//      부모는 하나니깐 따로 하나 더 생성하지 않고 이렇게 하면 된다.
        ai= new Cat();
        ai.eat();
    }
}
