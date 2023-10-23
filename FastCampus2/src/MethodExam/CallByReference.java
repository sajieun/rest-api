package MethodExam;

public class CallByReference {
    public static void main(String[] args) {
        float a = 56.7f;
        float b = 52.7f;
        floatAdd(a,b);
        float floathap = floatAdd2(a,b);
        System.out.println(floathap);
    }
//    위에 값을 아래로 call 전달해서 계산해보기
    public static void floatAdd(float a,float b){
        float hap = a+b;
        System.out.println(hap);
    }

    public static float floatAdd2(float a,float b){
        float hap = a+b;
        return hap;
    }
}
