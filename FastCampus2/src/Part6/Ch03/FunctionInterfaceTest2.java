package Part6.Ch03;

import Part6.Ch03.model.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
//        MathOperation 인터페이스를 내부 익명클래스로 구현
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result=mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
