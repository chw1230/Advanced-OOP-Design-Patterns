package AdvancedOOP.JDBC_DAO.DAO.고객정보DAO;

import java.util.List;

public class MainUsingCustomerDAO {
    public static void main(String[] args) {
        final String DB_FILE_PATH = "src/AdvancedOOP/JDBC_DAO/DAO/고객정보DAO/customer.db";

        // 데이터베이스 및 테이블 생성
        CustomerTableCreator.createNewDatabase(DB_FILE_PATH);
        SQLiteConnector sqlite = new SQLiteConnector();
        CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(DB_FILE_PATH));

        try {
            // 새로운 고객 정보를 데이터베이스에 추가
            Customer newCustomer = new Customer(
                    "홍지문문문문", "jmmmmhong@smu.ac.kr", "01012341234",
                    "서울시 종로구 홍지동 7");
            customerDAO.addCustomer(newCustomer);
            newCustomer = new Customer("Hong, Jisammm",
                    "jshong@smu.ac.kr", "0109999999",
                    "Hongji-dong 7 Jongro-gu Seoul");
            customerDAO.addCustomer(newCustomer);

            // 모든 고객 정보를 데이터베이스에서 읽어 출력
            List<Customer> customers = customerDAO.getAllCustomers();
            for (Customer c : customers) {
                System.out.println(c);
            }

            System.out.println(" --------- ");
            // 한 사람에 대한 정보를 출력
            int i = 2;
            Customer customer = customerDAO.getCustomerById(i);
            System.out.println("CustomerByID-" +  customer.toString());
        } catch (Exception e) {
            System.out.println("SQL failed: " + e);
        }
    }
}
