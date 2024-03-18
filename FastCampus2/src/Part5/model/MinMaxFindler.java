package Part5.model;

public class MinMaxFindler {
    private MinMaxFindler(){}
    public static int findmin(int[] arr){
        int min=arr[0]; // 초기값
        for(int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findmax(int[] arr){
        int max=arr[0]; // 초기값
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
