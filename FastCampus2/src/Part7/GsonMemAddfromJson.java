package Part7;

import Part7.model.Address;
import Part7.model.Person;
import com.google.gson.Gson;

public class GsonMemAddfromJson {
    public static void main(String[] args) {
        String json ="{\"name\":\"jieun\",\"age\":25,\"email\":\"aaa@naver.com\",\"address\":{\"city\":\"오산\",\"country\":\"한국\"}}";

        Gson gson = new Gson();
        Person person = gson.fromJson(json,Person.class);
        System.out.println("person = " + person);

    }
}
