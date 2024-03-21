package Part7;

import Part7.model.Member;
import com.google.gson.Gson;

public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"jieun\",\"age\":25,\"email\":\"aaaa@naver.com\"}";
//      JSON 에서 객체로
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json,Member.class);
        System.out.println(mvo);
    }
}
