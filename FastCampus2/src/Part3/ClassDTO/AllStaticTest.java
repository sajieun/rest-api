package Part3.ClassDTO;

import Part3.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        이 방법은 model이 static이 아닌 경우
//        AllStatic st = new AllStatic();
//        System.out.println(st.hap(10,20));
        System.out.println(AllStatic.hap(10,20));
    }
}
