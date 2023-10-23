package MethodExam;

public class OverloadingTest {
    public static void main(String[] args) {
        int hap = add(5,6);
        float hap2 = add(34.7f,32.5f);
        System.out.println(hap);
        System.out.println(hap2);
    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static float add(float a, float b){
        float sum = a+b;
        return sum;
    }
}
