package Part4.poly;

public interface RemoCon {
    void chUp();
    void chDown();
    void volUp();
    void volDown();
    void internet();

    // 인터페이스로 구현하기에 사용하지 못 한다
    // 추상메소드로 했을때는 가능하다.
//    public void internet(){
//        System.out.println("인터넷은 구동된다.");
//    }
}
