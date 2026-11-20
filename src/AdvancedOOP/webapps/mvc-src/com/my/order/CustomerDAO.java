package com.my.order;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    List<Customer> getAllCustomers() throws SQLException;
    Customer getCustomerById(int id) throws SQLException;
    void addCustomer(Customer customer) throws SQLException;
    void updateCustomer(Customer customer) throws SQLException;
    void deleteCustomer(int id) throws SQLException;
}
