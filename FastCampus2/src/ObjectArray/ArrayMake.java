package ObjectArray;

import ObjectClass.Book;

import java.util.Arrays;

public class ArrayMake {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        a[3] = 2;
        a[4] = 1;
        System.out.println(a[0]);
        for(int i = 0;i<a.length;i++){
            a[i] = 34;
        }
        System.out.println(a[0]);
        System.out.println("_____________");
        float[] b = new float[3];
        b[0] = 293;
        System.out.println("b[0] = " + b[0]);

        Book[] c = new Book[4];
//        c[0] = ; ? 어떻게 하라는겨
    }
}
