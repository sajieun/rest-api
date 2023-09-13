public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        int b='b';
        System.out.println("b = " + b);
        // Q. '가' 라는 한글 한 문자를변수에 저장하고 출력하세요
        char han='가';
        System.out.println("han = " + han);

        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력
        char upper='A';
        int lower =upper+32;
        System.out.println("(char)lower = " + (char)lower);
        
        char lower1='u';
        int upper1=lower1-32;
        System.out.println("(char)upper1 = " + (char)upper1);
        
        // Q. '1'+'2'=3이 나오도록 프로그래밍 하기
        char number='1'+'2';
        int three=number-48;
        System.out.println("number = " + (char)three);
    }
}