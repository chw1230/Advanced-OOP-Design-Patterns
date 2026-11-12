package AdvancedOOP.webapps.src.com.my.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector {
    private Connection conn;

    public Connection connect(String dbFilePath) {
        final String SQLITE = "jdbc:sqlite:";
        try {
            Class.forName("org.sqlite.JDBC"); // Tomcat 웹앱에서는 드라이버를 명시적으로 로드해야 함
            conn = DriverManager.getConnection(SQLITE + dbFilePath);
            System.out.println("Connected to the SQLite database!");
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found in WEB-INF/lib!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the SQLite database!");
            e.printStackTrace();
        }
        return conn;
    }

    public void close() {
        try {
            if (conn != null) conn.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.out.println("Failed to close connection!");
            e.printStackTrace();
        }
    }
}
