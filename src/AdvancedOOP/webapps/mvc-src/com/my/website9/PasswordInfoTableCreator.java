package com.my.website9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 테이블 생성
public class PasswordInfoTableCreator {
    public static void createNewDatabase(String dbFilePath) {
        // 웹 애플리케이션에서는 JDBC 드라이버를 명시적으로 등록해야 함
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        final String SQLITE = "jdbc:sqlite:";
        String url = SQLITE + dbFilePath;
        final String SQLITE_TABLE_CREATE_QUERY =
                "CREATE TABLE IF NOT EXISTS passwordInfo ("
                        + "url TEXT PRIMARY KEY, "
                        + "id TEXT NOT NULL, "
                        + "password TEXT NOT NULL)";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
                // DROP을 하면 Tomcat 재시작마다 데이터가 지워지므로 제거, 테이블이 없을 때만 생성
                stmt.executeUpdate(SQLITE_TABLE_CREATE_QUERY);
                System.out.println("Table ready!");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewDatabase("/WEB-INF/data/mvc/passwordInfo.db");
    }
}
