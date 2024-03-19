package Part5.ch04;

import Part5.ch04.model.Connecion;

// OracleDriver는 Oracle회사가 만들어서 제공하면 된다.(Driver)
public class MSSQLDriver implements Connecion {

    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("MSSQL에 접속 시도한다.");
    }
}
