package Part6.Ch02;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String,Integer> par = new Pair<>("hello",1);

        System.out.println(par);
        System.out.println(par.getKey());
        System.out.println(par.getValue());

    }
}
