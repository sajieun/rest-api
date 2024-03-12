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

        // Overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램 실행 속도와는 무관하다.
        // Override(재정의)      : 동적바인딩 = 실행시점에서 사용될(호출될)메서드가 결정되는 바인딩
        // -> 프로그램 실행 속도와 관계가 있다.
        }
}
