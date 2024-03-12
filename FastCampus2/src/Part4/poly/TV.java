package Part4.poly;

public class TV implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("TV 채널 업");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널 다운");
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼륨 다운");
    }

    @Override
    public void internet() {
        System.out.println("TV 인터넷이 됩니다.");
    }
}
