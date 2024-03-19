package Part6.Ch01;

public class WapperTest {
    public static void main(String[] args) {
//        정수형 변수에 10을 저장하세요
        int a = 10;
        Integer aa = new Integer(10); // 사용자 자료형 box형식
        System.out.println(aa.intValue()); // Integer -> int 로 다시 변경

        Integer aa2 = 20; // 사용자 자료형 auto-box형식
        int b = aa2; // 타입은이 다르지만 자동으로 풀려짐 Integer -> int
        System.out.println(b);
    }
}
