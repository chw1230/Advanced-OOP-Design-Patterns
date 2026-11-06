package AdvancedOOP.JDBC_DAO.DAO.간단실습;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// concrete DAO - 실제 DB 연결, SQL 실행, 결과 매핑 / DB 관련 코드는 전부 여기에 위치
// DB 경로, DB 종류, SQL이 바뀌어도 CustomerDAO1만 고치면됨
public class CustomerDAO1 implements DAO1 {
    private static final String SQLITE = "jdbc:sqlite:";
    private static final String DB_FILE_PATH = "src/AdvancedOOP/JDBC_DAO/DAO/간단실습/customer.db";

    private Connection getConnection() throws SQLException { // DB 연결 메서드
        return DriverManager.getConnection(SQLITE + DB_FILE_PATH);
    }

    public List<Customer1> getAllCustomers() {
        List<Customer1> customers = new ArrayList<Customer1>();
        String sql = "SELECT * FROM customers";
        try (Connection conn = getConnection(); // 1. 데이터베이스 연결(Connection) 객체 획득
             Statement stmt = conn.createStatement(); // 2. SQL 쿼리를 실행하기 위한 Statement 객체 생성
             ResultSet rs = stmt.executeQuery(sql) // 3. SQL 쿼리를 데이터베이스에 전달하고 결과 집합(ResultSet) 반환받기
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                customers.add(new Customer1(id, name));   // 행 -> 객체로 매핑
            }
        }
        catch (SQLException e) { e.printStackTrace(); }
        return customers;
    }
}
