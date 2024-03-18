package Part4;

import Part4.poly.A;
import Part4.poly.B;

import static Part4.PolyMethodTest.display;


public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj) {
        if (obj instanceof A){
            ((A)obj).printGo();
        }else {
            ((B)obj).printGo();
        }
    }
}
