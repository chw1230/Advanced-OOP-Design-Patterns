package com.web.example.repository;

import com.web.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private final String URL = "jdbc:sqlite:customer.db";

    public CustomerRepository() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            String createTable = "CREATE TABLE IF NOT EXISTS customer (" +
                                 "id INTEGER PRIMARY KEY, " +
                                 "name TEXT NOT NULL, " +
                                 "email TEXT NOT NULL)";
            conn.createStatement().execute(createTable);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void save(Customer customer) {
        String sql = "INSERT OR REPLACE INTO customer (id, name, email) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, customer.getId());
            pstmt.setString(2, customer.getName());
            pstmt.setString(3, customer.getEmail());
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Customer findById(Long id) {
        String sql = "SELECT id, name, email FROM customer WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getLong("id"),
                                    rs.getString("name"),
                                    rs.getString("email"));
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT id, name, email FROM customer";
        try (Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                customers.add(new Customer(rs.getLong("id"),
                                           rs.getString("name"),
                                           rs.getString("email")));
            }
        } 
        catch (SQLException e) { e.printStackTrace(); }
        return customers;
    }
}