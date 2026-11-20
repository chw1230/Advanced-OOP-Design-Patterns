package com.my.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector {    
    private Connection conn;
    
    public Connection connect(String dbFilePath) {
        final String SQLITE = "jdbc:sqlite:";        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(SQLITE + dbFilePath);
            System.out.println("Connected to the SQLite database!");
        } 
        catch (SQLException e) {
            System.out.println("Failed to connect to the SQLite database!");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Could not find sqlite driver!");
            e.printStackTrace();
        }
        return conn;
    }    
    public void close() {
        try {
            if (conn != null) conn.close();
            //conn.close();
            System.out.println("Connection to the SQLite database closed!");
        } 
        catch (SQLException e) {
            System.out.println("Failed to close the connection to the SQLite database!");
            e.printStackTrace();
        }
    }
}