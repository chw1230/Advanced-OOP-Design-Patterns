package AdvancedOOP.JDBC_DAO.JDBC;

import java.sql.*;

public class Sqlite1 {
    public static void main(String args[]) throws SQLException {
        final String MY_DB_FILE_PATH = "src/AdvancedOOP/JDBC_DAO/JDBC/dp.db";
        String sqlite2MyDb = "jdbc:sqlite:" + MY_DB_FILE_PATH; // SQLite URL 설정하기
        System.out.println("sqliteJdbcto mydb: " + sqlite2MyDb);
        try {
            try (Connection conn = DriverManager.getConnection(sqlite2MyDb)) { // 연결
                System.out.println("Connection: " + conn);
                // 여기서SQL 쿼리등을 실행가능
                try (Statement stmt = conn.createStatement(); // SQL 실행
                     ResultSet rs = stmt.executeQuery("SELECT * FROM customer") // 조회에 사용하는 메서드 - executeQuery( )
                ) {

                    // 결과 확인
                    while (rs.next()) {
                        String s = rs.getString("c_name");
                        System.out.println(s);
                    }
                }
            } // conn.close() 자동호출
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 버전 출력
        Driver driver = DriverManager.getDriver("jdbc:sqlite:");
        String jdbcVersion = driver.getMajorVersion() + "." + driver.getMinorVersion();
        System.out.println("driver - vervion : " + jdbcVersion);
    }
}