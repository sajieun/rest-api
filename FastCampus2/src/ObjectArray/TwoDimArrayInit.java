package ObjectArray;

public class TwoDimArrayInit {
    public static void main(String[] args) {
        int[][] dazong={{1,2,3},{4,5,6}};

        for (int i=0;i<dazong.length;i++){
            for(int j=0;j<dazong[i].length;j++){
                System.out.print(dazong[i][j]);
            }
            System.out.println();
        }

        int[][] b = new int[5][];
        b[0]=new int[1];
        b[1]=new int[2];
        b[2]=new int[3];
        b[3]=new int[4];
        b[4]=new int[5];

        for (int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = '*';
                System.out.print((char) b[i][j]);
            }
            System.out.println();
        }
    }
}
