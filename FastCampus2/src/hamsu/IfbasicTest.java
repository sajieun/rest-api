package hamsu;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int age = scanner.nextInt();
//        Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지 출력
        if (a%7 == 0){
            System.out.println("7의 배수 입니다.");
        }else System.out.println("7의 배수가 아닙니다.");

//        Q. 나이를 입력 받아 19세 이상이면 성인을 출력
        if (age<=19){
            System.out.println("성인입니다.");
        }else System.out.println("you is baby");
    scanner.close();
    }
}
