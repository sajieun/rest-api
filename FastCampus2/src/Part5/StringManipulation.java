package Part5;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replaceAll("o","x"));
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(5));
        System.out.println(str.indexOf("Wr")); //  못 찾으면 -1을 반환한다.
        System.out.println(str.indexOf("W"));



    }
}
