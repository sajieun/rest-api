package Part6.Ch03;

import Part6.Ch03.model.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
//        람다식 전
//        MathOperation add = new MathOperation() {
//            @Override
//            public int operation(int x, int y) {
//                return x+y;
//            }
//        };

//        람다식인데 좀 덜 간결하게
//        MathOperation add = (int x,int y) -> {return x+y;};

//        람다식에 완전 간결하게 (코드 간결하게, 확장, 구현이 쉽다)
        MathOperation add = (x, y) -> x+y;
        int result = add.operation(10,20);
        System.out.println(result );
    }
}
