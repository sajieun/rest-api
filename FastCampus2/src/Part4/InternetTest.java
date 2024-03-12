package Part4;

import Part4.poly.Redio;
import Part4.poly.RemoCon;
import Part4.poly.TV;

public class InternetTest {
    public static void main(String[] args) {
        RemoCon remo = new Redio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
