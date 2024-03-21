package Part7;

import Part7.model.Member;
import com.google.gson.Gson;
public class GsontoJson {
    public static void main(String[] args) {
        Member member = new Member("jieun",25,"aaaa@naver.com");
//       객체를 JSON으로 변경하기
        Gson gson = new Gson();
        String josn = gson.toJson(member);
        System.out.println(josn);

    }
}
