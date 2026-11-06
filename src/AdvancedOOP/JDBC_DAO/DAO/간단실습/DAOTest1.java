package AdvancedOOP.JDBC_DAO.DAO.간단실습;

import java.util.List;

// DAO를 호출해서 데이터를 받아씀
public class DAOTest1 {
    public static void main(String[] args) {
        DAO1 dao = new CustomerDAO1(); // 인터페이스 타입으로 받음
        List<Customer1> customers = dao.getAllCustomers();
        for (Customer1 c : customers) System.out.println(c);
    }
}
