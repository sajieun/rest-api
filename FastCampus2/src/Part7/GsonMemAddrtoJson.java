package Part7;

import Part7.model.Address;
import Part7.model.Person;
import com.google.gson.Gson;

public class GsonMemAddrtoJson {
    public static void main(String[] args) {
        Address address = new Address("오산","한국");
        Person person = new Person("jieun",25,"aaa@naver.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("json = " + json);
    }
}
