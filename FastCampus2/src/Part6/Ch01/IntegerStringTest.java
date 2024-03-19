package Part6.Ch01;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num+123);

        String str2 = ""+num;
        System.out.println(str2+123);
    }
}
