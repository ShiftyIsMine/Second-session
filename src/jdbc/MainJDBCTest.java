package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 주문,제품 where 주문제품=제품번호";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                String customerId = result.getString("주문고객");
                String productId = result.getString("주문제품");
                String productName = result.getString("제품명");
                int count = result.getInt("수량");
                System.out.printf("- 주문고객명 : %s\t- 주문제품ID : %s\t- 주문제품명 : %s\t- 주문수량 : %d\n", customerId,productId, productName, count);
            }
        } catch (SQLException e) {
            System.out.println("문장 객체 생성에 문제가 발생했습니당.");
        }
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("연결종료에 문제가 발생했슴당.");
        }
    }
}