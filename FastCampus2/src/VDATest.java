public class VDATest {
    public static void main(String[] args) {
//      1. 내가 한거는 뭔가 지저분함
        int a = 10;
        int b;
        int c;
         b = a;
        System.out.println("b = " + b);
         c = b*10;
        System.out.println("c = " + c);

//      1.  정답
        int d = 10;
        System.out.println("d = " + d);
        int e = a;
        System.out.println("e = " + e);
        int f = b* 10;
        System.out.println("f = " + f);

//        2.
        int sum = 0; // 0값으로 꼭 지정을 해줘야한다. (초기화)
        sum = sum +1;
        sum = sum +2;
        sum = sum +3;
        sum = sum +4;
        sum = sum +5;
        System.out.println("sum = " + sum);


//        3. 내가 한 방식
        int x = 10;
        int y = 20;
        int z = x;
        x = y;
        System.out.println("x = " + x);
        y = z;
        System.out.println("y = " + y);

//        3.정답




         
        
    }
}
