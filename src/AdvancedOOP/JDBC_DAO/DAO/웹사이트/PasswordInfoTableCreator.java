package AdvancedOOP.JDBC_DAO.DAO.웹사이트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 테이블 생성
public class PasswordInfoTableCreator {
    public static void createNewDatabase(String dbFilePath) {
        final String SQLITE = "jdbc:sqlite:";
        String url = SQLITE + dbFilePath;
        final String SQLITE_TABLE_CREATE_QUERY =
                "CREATE TABLE passwordInfo ("
                        + "url TEXT PRIMARY KEY, "
                        + "id TEXT NOT NULL, "
                        + "password TEXT NOT NULL)";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
                String sql = "DROP TABLE IF EXISTS passwordInfo;";
                stmt.executeUpdate(sql);
                stmt.executeUpdate(SQLITE_TABLE_CREATE_QUERY);
                System.out.println("Table created successfully!");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewDatabase("src/AdvancedOOP/JDBC_DAO/DAO/웹사이트/passwordInfo.db");
    }
}
