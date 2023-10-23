package MethodExam;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");
//        sout에 모든 자료형이 들어가니깐 이걸 Method overloading이라고 한다.

        int max = maxValue(7,9);
        int min = minValue(3,8);
        System.out.println(max);
        System.out.println(min);

    }
//    Q. 두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의하시오
    public static int maxValue(int a, int b){
        return (a > b) ? a : b;
    }

    public static int minValue(int a, int b){
        return (a < b) ? a : b;
    }
}
