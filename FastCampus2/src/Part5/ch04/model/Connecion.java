package Part5.ch04.model;
// interface는 자바에서 제공을 한다.
public interface Connecion {
    // DB 연결동작
    public void getConnection(String url, String username, String password);
}
