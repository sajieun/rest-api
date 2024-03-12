package Part4.poly;

public class AbstactClass {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ((Dog)ani).night();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
    }
}
