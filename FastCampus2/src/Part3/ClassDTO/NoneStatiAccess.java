package Part3.ClassDTO;

import Part3.model.MyUtil1;

public class NoneStatiAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyUtil1 my1= new MyUtil1();
        int sum = my1.hap(a,b);
        System.out.println(sum);
    }
}
