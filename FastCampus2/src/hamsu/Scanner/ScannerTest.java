package hamsu.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        int price = scanner.nextInt();
        String chool = scanner.next();
        scanner.nextLine(); // 버퍼 비우기
        String zeza = scanner.next();
        int isbn = scanner.nextInt();
        System.out.println(title);
        System.out.println(price);
        System.out.println(chool);
        System.out.println(zeza);
        System.out.println(isbn);
        scanner.close(); // -> Scanner 종료
    }
}
