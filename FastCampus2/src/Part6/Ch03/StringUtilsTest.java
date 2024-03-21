package Part6.Ch03;

import Part6.Ch03.model.Converter;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
//        인스턴스 메서드 참조
        Converter<String,String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println("result = " + result);
    }
}
