package hamsu;

public class WhileLoopTest {
    public static void main(String[] args) {
        int i =0;
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        int num2= 1;
        do {
            System.out.println(num2);
            num2++;
        }while (num2<=10);

    }
}
