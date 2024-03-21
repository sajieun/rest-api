package Part6.Ch03;

import Part6.Ch03.model.MathOperation;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result=mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
