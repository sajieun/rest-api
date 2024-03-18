package Part4;

import Part4.poly.A;
import Part4.poly.B;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();
        display(obj);
//        for (int i = 0; i < obj.length; i++) {
//            if (obj[i] instanceof A) {
//                ((A) obj[i]).printGo();
//            } else {
//                ((B) obj[i]).printGo();
//            }
//
//        }
    }

    private static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).printGo();
            } else {
                ((B) obj[i]).printGo();
            }

        }
    }
}
