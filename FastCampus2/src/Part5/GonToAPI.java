package Part5;

import Part5.model.Person;
import com.google.gson.Gson;

// 자바 객체를 JSON으로 변환하기
public class GonToAPI {
    public static void main(String[] args) {
        Person person = new Person("홍길동",30);
        Gson gson = new Gson();
        System.out.println("person = " + person);
        String json = gson.toJson(person);
        System.out.println("json = " + json);

    }
}
