package Part3.ClassDTO;

import Part3.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 40;
        arr[2] = 30;
        arr[3] = 60;
        arr[4] = 70;
        arr[5] = 50;

        Student stu = new Student("sajieun","컴공",24,"@gmail.com",231127,"010-4444-5555");
        System.out.println("stu = " + stu);

        Student[] std = new Student[4];
        std[0] = new Student("eun","컴공",24,"@gmail.com",231127,"010-4444-5555");
        std[1] = new Student("eufn","컴공",24,"@gmail.com",231127,"010-4444-5555");
        std[2] = new Student("erun","컴공",24,"@gmail.com",231127,"010-4444-5555");
        std[3] = new Student("eeun","컴공",24,"@gmail.com",231127,"010-4444-5555");

        for (int i=0; i<std.length; i++) {
            System.out.println(std[i]);
        }

        for (Student st : std){
            System.out.println(st.toString());
        }


    }
}
