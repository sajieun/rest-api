package Part4;

import Part4.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();
        a.display();

        // Object를 선언하지 않았지만 java 자체에서 제공해줌
        // 근데 Object에 직접 선언은 하지 않았으니
        // ((A)obj).display(); 이렇게 만들어주면 됨
        // Downcasting 기법임
        Object obj = new A();
        ((A)obj).display();

    }
}
