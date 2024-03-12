package Part4.poly;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }

    public void night(){
        System.out.println("밤에 곤히 잘 잔다.");
    }
}
