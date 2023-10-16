package hamsu;

import java.util.Scanner;

public class Yoonyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year%4==0&&year%100!=0) || (year%400==0)){
            System.out.println("윤년입니다.");
        }else System.out.println("윤년이 아닙니다.");
    }
}
