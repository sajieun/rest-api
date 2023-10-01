package ObjectArray;

public class ArrayTest {
    public static void main(String[] args) {
        float[] a = new float[5];
        for(int i=0;i<a.length;i++){
            a[i]=10;
        }

        int[] b = {10,20,30,40,50};
        System.out.println(b[0]+b[3]);
        System.out.println(b.length);

    }
}
