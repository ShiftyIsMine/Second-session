package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static Connection con;

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER_NAME = "c##shiftyJJS";
    private static final String PASSWORD = "1234";
    public static Connection getConnection() {
        //JDBC Driver 로딩(OracleDriver 클래스의 객체 생성)
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("JDBC Driver 정상 로딩 성공~!");
            //Oracle DB와 연결
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            System.out.println("Oracle DB와 연결 성공~!");
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!!");
        } catch (SQLException e) {
            System.out.println("Oracle JDBC connection failed!!");
        }
        return con;
    }
}
