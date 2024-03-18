package Part5;

import Part5.model.MinMaxFindler;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr ={5,3,9,1,7};
        int min= MinMaxFindler.findmin(arr);
        int max= MinMaxFindler.findmax(arr);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
