package AdvancedOOP.JDBC_DAO.JDBC;

import java.sql.*;

public class JDBCTest1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 드라이버 적재
            Class.forName("org.sqlite.JDBC");

            // 2. 연결
            conn = DriverManager.getConnection("jdbc:sqlite:src/AdvancedOOP/JDBC_DAO/JDBC/dp.db");

            // 3. Statement 생성 : SQL을 보낸 통로 생성하기
            stmt = conn.createStatement();

            // 4. SQL 실행 : 조회 결과를 ResultSet으로 받기
            rs = stmt.executeQuery("SELECT * FROM customers");

            // 5. 결과 돌기
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + ", " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 6. 자원의 해제 - 열린 역순으로 닫기
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
