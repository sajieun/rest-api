package Part6.Ch01;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,1,3};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : nums){
            uniqueNumbers.add(num);
        }

        System.out.println("-------------");

        for (int num : uniqueNumbers){
            System.out.print(num);
        }
    }
}
