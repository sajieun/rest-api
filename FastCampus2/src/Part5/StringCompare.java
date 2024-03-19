package Part5;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)){
            System.out.println("같음");
        }else System.out.println("다름");

//        compareTo() 메서드를 사용한 문자열 비교 예제 코드
        String str3 = "aplle";
        String str4 = "banana";

        int result = str3.compareTo(str4);

        if (result ==0){
            System.out.println("같음");
        } else if (result <0) {
            System.out.println(str3+str4);
        }else System.out.println(str4+str3);

    }
}
