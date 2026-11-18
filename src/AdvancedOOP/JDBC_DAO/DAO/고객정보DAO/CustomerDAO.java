package AdvancedOOP.JDBC_DAO.DAO.고객정보DAO;

import java.sql.SQLException;
import java.util.List;

// 어떤 데이터 작업을 할 수 있는지 정의, 어떻게 하는 지는 모름
public interface CustomerDAO {
    List<Customer> getAllCustomers() throws SQLException; // 모든 고객을 List로 반환
    Customer getCustomerById(int id) throws SQLException; // 특정 ID 값만 넣기
    void addCustomer(Customer customer) throws SQLException; // 고객 추가
    void updateCustomer(Customer customer) throws SQLException; // 고객 정보 변경
    void deleteCustomer(int id) throws SQLException; // id 삭제
}
