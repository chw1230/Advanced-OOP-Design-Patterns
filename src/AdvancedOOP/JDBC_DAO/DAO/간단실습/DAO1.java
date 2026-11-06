package AdvancedOOP.JDBC_DAO.DAO.간단실습;

import java.util.List;

// 어떤 데이터 작업을 할 수 있는지 정의, 어떻게 하는 지는 모름
public interface DAO1 {
    public List<Customer1> getAllCustomers(); // 전체 data 뽑기
}
