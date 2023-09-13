public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f; // 0.10
        System.out.println("f1 = " + f1);

        float f2 = 15f; // 0.10
        System.out.println("f2 = " + f2);

        float x=15.6f;
        int y=(int)x; // 강제형변환(손실)
        System.out.println("y = " + y);

        char c='A';
        int cc=c; // 자동형변환
        System.out.println("cc = " + cc);

        int dd=5;
        double ddd=dd;
        System.out.println("ddd = " + ddd);
        
    }
}
