package Part4;

// 일반사원(vo)
public class RempVO extends Employee {
    public RempVO(){
        super();
    }
    public RempVO(String name, int age, String phone, String dept, boolean marriage){
        // 초기화
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.dept = dept;
//        this.marriage = marriage;

        super(name, age,phone,dept,marriage); // 부모의 생성자 호출
    }
}
