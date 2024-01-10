package Part4;
// 사원
public class Employee {
    private String name;
    private int age;
    private String phone;
    private String dept;
    private boolean marriage;

    public Employee(String name, int age, String phone, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dept = dept;
        this.marriage = marriage;
    }

    public Employee(){
        super(); // 상위클래스의 생성자를 호출 -> new Object() 생략 가능
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
