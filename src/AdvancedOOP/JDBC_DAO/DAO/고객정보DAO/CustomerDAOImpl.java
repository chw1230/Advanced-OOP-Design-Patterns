package AdvancedOOP.JDBC_DAO.DAO.고객정보DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


// 실제 DB 연결, SQL 실행, 결과 매핑 / DB 관련 코드는 전부 여기에 위치
public class CustomerDAOImpl implements CustomerDAO {
    private Connection connection;

    public CustomerDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        final String sql = "SELECT * FROM customers";
        List<Customer> customers = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql); // SELECT만 executeQuery()를 사용
        while (resultSet.next()) {
            Customer customer = new Customer(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address")
            );
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        final String sql = "SELECT * FROM customers WHERE id = ?";
        Customer customer = null;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id); // 첫 번째 물음표(?) 자리에 변수 id의 값을 정수(int) 형태로 넣기
        ResultSet resultSet = preparedStatement.executeQuery(); // SELECT만 executeQuery()를 사용
        if (resultSet.next()) {
            customer = new Customer(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address")
            );
        }
        return customer;
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        final String sql = "INSERT INTO customers (name, email, phone, address) " + "VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getPhoneNumber());
        preparedStatement.setString(4, customer.getAddress());
        preparedStatement.executeUpdate();
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        final String sql = "UPDATE customers SET name = ?, email = ?, phone = ?, address = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql); // 연결

        // 찾아서 바꾸기
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getPhoneNumber());
        preparedStatement.setString(4, customer.getAddress());
        preparedStatement.setInt(5, customer.getId());
        preparedStatement.executeUpdate();
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM customers WHERE id = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
}
