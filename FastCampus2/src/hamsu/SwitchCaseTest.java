package hamsu;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        switch (day){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
                break;
        }
    }
}
