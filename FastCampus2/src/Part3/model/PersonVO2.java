package Part3.model;

public class PersonVO2 {
    public String name;
    private int age;
    private String phone;

    public PersonVO2(){
        this.name = "jieun";
        this.age=17;
        this.phone="010-5555-6666";

    }

    // 내가 원하는 매개변수로 할 수 있게끔 만들기
    public PersonVO2(String name,int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
