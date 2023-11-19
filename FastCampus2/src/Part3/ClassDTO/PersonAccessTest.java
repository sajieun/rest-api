package Part3.ClassDTO;

public class PersonAccessTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "jieun";
        p.age = 1000; // -> 이런 값들은 있을 수 없으니깐 이걸 방지하기 위해서 접근제어가 필요함
        p.phone = "01044444444";
        System.out.println("p.name+p.age+p.phone = " + p.name+p.age+p.phone);
    }
}
