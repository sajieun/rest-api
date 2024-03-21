package Part6.Ch03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        이게 예전방식 for문을 이용
//        int even = 0;
//        for (int num : numbers){
//            if (num%2==0){
//                even+=num;
//            }
//        }

//      짝수의 합 Stream과 람다식 사용하기
        int sumofEvens =Arrays.stream(numbers)
                .filter(n->n%2==0)
                .sum();
        System.out.println(sumofEvens);

//        짝수의 배열 Stream과 람다식 사용하기
        int[] evenNumbers=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        for (int even : evenNumbers){
            System.out.println(even);
        }
    }
}
