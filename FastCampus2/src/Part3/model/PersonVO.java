package Part3.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>0 && age <=120){
            this.age = age;
        }
    }

    public void setPhone(String phone) {
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
}

