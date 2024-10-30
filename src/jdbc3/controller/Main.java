package jdbc3.controller;
import jdbc.JDBCConnector;
import jdbc3.Repository.ProductRepository;
import jdbc3.entity.Product;
import jdbc3.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //연결 객체를 반환받는다.
        ArrayList<Product> arrList = ProductRepository.getList();
        ProductView.printView(arrList);
    }
}