package Part5;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문지열을 입력하세요: ");
        String str = scanner.nextLine();

        String[] strArray = str.split(",");

        for (String s : strArray){
            System.out.println(s);
        }
        scanner.close();
//        -----------------------------------------

        String[] strArray2 = str.split("\\s+");

        for (String s : strArray2){
            System.out.println(s);
        }
        scanner.close();
    }
}
