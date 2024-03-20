package Part6.Ch03;

public class IntergerUtilsTest {
    public static void main(String[] args) {
        Converter<String,Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");
        System.out.println("result = " + result);
    }
}
