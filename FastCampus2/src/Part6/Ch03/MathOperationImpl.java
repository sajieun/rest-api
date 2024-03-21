package Part6.Ch03;

import Part6.Ch03.model.MathOperation;

public class MathOperationImpl implements MathOperation {


    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
