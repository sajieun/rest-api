package Part5;

import java.util.Scanner;

public class StringSplit2 {
    public static void main(String[] args) {
        String str = "Hello,World,Java";

        String[] strArray = str.split(",");

        for (String s : strArray){
            System.out.println(s);
        }
//        -----------------------------------------
        String str2 = "Hello World Java";

        String[] strArray2 = str2.split("\\s+"); // 공백제거 \s -> \\s 로

        for (String s : strArray2){
            System.out.println(s);
        }
    }
}
