package Part5.ch04;

import Part5.ch04.model.Connecion;

public class DataBaseConnection {
    public static void main(String[] args) {
//        오라클 DB 접속
        Connecion conn = new OracleDriver();
        conn.getConnection("o","o","o");


        Connecion conn2 = new MySQLDriver();
        conn2.getConnection("oo","oo","oo");


    }
}
