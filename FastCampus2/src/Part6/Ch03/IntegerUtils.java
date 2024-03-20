package Part6.Ch03;
// 1. 정적 메서드 참조:클래스명::메서드명

public class IntegerUtils {
//    static 이 붙은건 정적메서드 , 클래스메서드라고 한다.
    public static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}

