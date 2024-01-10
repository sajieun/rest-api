package Part4;

import Part4.model.Animal;
import Part4.model.Cat;
import Part4.model.Dog;

// 다운캐스팅 한 번 더 복습 하고 다형성 !
public class PolyTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
    }
}
