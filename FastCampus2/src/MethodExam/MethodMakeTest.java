package MethodExam;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a =3;
        int b =5;
//        add 메서드 호출하여 두수의 합 결과 받기
        int result = add(a,b);
        System.out.println(result);
    }
//    별도 메소드 만들기
//        추출타입
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
}
