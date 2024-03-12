package Part4.poly;

public class IsNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
    }
}
