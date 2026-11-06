package AdvancedOOP.JDBC_DAO.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// import java.sql.*; // 여기서는각클래스를따로 import하는것을보임

public class Sqlite1 {
    public static void main(String args[]) {
        final String MY_DB_FILE_PATH = "src/AdvancedOOP/JDBC_DAO/JDBC/dp.db";
        String sqlite2MyDb = "jdbc:sqlite:" + MY_DB_FILE_PATH;
        System.out.println("sqliteJdbcto mydb: " + sqlite2MyDb);
        try {
            // Class.forName("org.sqlite.JDBC"); // (1)
            // DriverManager.registerDriver(new org.sqlite.JDBC()); // (2)  실습: SQLite JDBC 드라이버등록및연결
            // try-with-resources로 자동 close
            try (Connection conn =
                         DriverManager.getConnection(sqlite2MyDb)) {
                System.out.println("Connection: " + conn);
                // 여기서SQL 쿼리등을실행가능
            } // conn.close() 자동호출
        } 
        /*catch (ClassNotFoundException e) {
        System.out.println("Error: JDBC driver not 
        found!");
        e.printStackTrace();
        } */ catch (SQLException e) {
            e.printStackTrace();
        }
    }
}