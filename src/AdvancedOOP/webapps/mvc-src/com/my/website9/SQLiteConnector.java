package com.my.website9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 실제 데이터베이스와의 연결을 관리
public class SQLiteConnector {
    private Connection conn;

    public Connection connect(String dbFilePath) {
        final String SQLITE = "jdbc:sqlite:";
        try {
            conn = DriverManager.getConnection(SQLITE + dbFilePath);
            System.out.println("Connected to the SQLite database!");
        }
        catch (SQLException e) {
            System.out.println("Failed to connect to the SQLite database!");
            e.printStackTrace();
        }
        return conn;
    }

    public void close() {
        try {
            if ( conn != null ) conn.close();
            System.out.println("Connection closed!");
        }
        catch (SQLException e) {
            System.out.println("Failed to close connection!");
            e.printStackTrace();
        }
    }
}
