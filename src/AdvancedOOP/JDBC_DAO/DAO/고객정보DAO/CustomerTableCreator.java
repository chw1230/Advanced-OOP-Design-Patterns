package AdvancedOOP.JDBC_DAO.DAO.고객정보DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerTableCreator {
    public static void createNewDatabase(String dbFilePath) {
        final String SQLITE = "jdbc:sqlite:";
        String url = SQLITE + dbFilePath;
        final String SQLITE_TABLE_CREATE_QUERY =
                "CREATE TABLE customers ("
                        + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + "name TEXT NOT NULL, address TEXT NOT NULL,"
                        + "email TEXT NOT NULL, phone TEXT NOT NULL)";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
                String sql = "DROP TABLE IF EXISTS customers;";
                stmt.executeUpdate(sql);
                stmt.executeUpdate(SQLITE_TABLE_CREATE_QUERY);
                System.out.println("Table created successfully!");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewDatabase("src/AdvancedOOP/JDBC_DAO/DAO/고객정보DAO/customer.db");
    }
}
