package Part4;

import Part4.model.Animal;
import Part4.model.Cat;
import Part4.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    public static void display(Animal ani){
        ani.eat();
        ani.night();
    }
}
