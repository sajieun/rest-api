package ObjectArray;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0][0] = 5;
        arr[0][1] = 5;
        arr[0][2] = 5;
        arr[0][3] = 5;

        arr[1][0] = 5;
        arr[1][1] = 5;
        arr[1][2] = 5;
        arr[1][3] = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // 각 행을 구분하기 위해 개행 추가
        }
    }
}
