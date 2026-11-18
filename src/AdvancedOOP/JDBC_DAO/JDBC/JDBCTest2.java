package AdvancedOOP.JDBC_DAO.JDBC;

import java.sql.*;

public class JDBCTest2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:src/AdvancedOOP/JDBC_DAO/JDBC/dp.db";
        String sql = "SELECT * FROM customers";
        try (Connection conn = DriverManager.getConnection(url); // 적재 연결
             Statement stmt = conn.createStatement(); // SQL 실행 연결 생성
             ResultSet rs = stmt.executeQuery(sql)) { // SQL 실행 후 결과 저장
            while (rs.next()) { // 결과 순회
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
