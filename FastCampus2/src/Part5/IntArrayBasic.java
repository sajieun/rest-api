package Part5;

public class IntArrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =4;
        arr[4] =5;

        for (int i=0;i<arr.length;i++){
            int data = arr[i];
            System.out.print(data);
        }

        // 향상된 for문 foreach
        for (int data : arr){
            System.out.print(data);
        }

    }
}
