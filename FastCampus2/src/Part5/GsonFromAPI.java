package Part5;

import Part5.model.Person;
import com.google.gson.Gson;

// Json을 자바 객체로 변환하기
public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":25}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json,Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
