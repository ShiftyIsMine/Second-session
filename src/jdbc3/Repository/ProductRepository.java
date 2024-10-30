package jdbc3.Repository;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {
    public static ArrayList<Product> getList(){
        ArrayList<Product> arrList = new ArrayList<Product>();
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 제품";
        try {

            PreparedStatement pstmt1 = con.prepareStatement(sql);
            //resultset의 반환값 참조
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setSerial(rs.getString("제품번호"));
                product.setName(rs.getString("제품명"));
                product.setStock(rs.getInt("재고량"));
                product.setPrice(rs.getInt("단가"));
                product.setManufacturer(rs.getString("제조업체"));
                arrList.add(product);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return arrList;
    }
}
