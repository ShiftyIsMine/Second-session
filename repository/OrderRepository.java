package JAVA1205._gui.repository;

import JAVA1205._gui.entity.OrderEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderRepository {
    ArrayList<OrderEntity> orderList = new ArrayList<OrderEntity>();

    public ArrayList<OrderEntity> getOrderList(String searchWord){
        Connection con = jdbc.JDBCConnector.getConnection();
        String sql = "select 주문번호,고객이름,제품명,수량,배송지,주문일자 from 고객 c,주문 o,제품 p where o.주문고객=c.고객아이디 and o.주문제품=p.제품번호 and 고객이름 like ?";
        OrderEntity orderEntity = null;
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"%" + searchWord + "%");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                orderEntity = new OrderEntity();
                orderEntity.setOrderNum(rs.getString("주문번호"));
                orderEntity.setCustomerName(rs.getString("고객이름"));
                orderEntity.setProductName(rs.getString("제품명"));
                orderEntity.setAmount(rs.getInt("수량"));
                orderEntity.setDestination(rs.getString("배송지"));
                orderEntity.setOrderDate(rs.getTimestamp("주문일자"));
                orderList.add(orderEntity);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return orderList;
    }
}
