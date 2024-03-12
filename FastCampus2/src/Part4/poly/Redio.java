package Part4.poly;

public class Redio implements RemoCon {

    @Override
    public void chUp() {
        System.out.println("Redio 채널 업");
    }

    @Override
    public void chDown() {
        System.out.println("Redio 채널 다운");
    }

    @Override
    public void volUp() {
        System.out.println("Redio 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("Redio 볼륨 다운");
    }

    @Override
    public void internet() {
        System.out.println("Redio는 인터넷이 안됩니다.");
    }
}
