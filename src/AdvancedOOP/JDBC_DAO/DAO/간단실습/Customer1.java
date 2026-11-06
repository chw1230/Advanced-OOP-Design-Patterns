package AdvancedOOP.JDBC_DAO.DAO.간단실습;

// DB의 한 행을 담는 Java 객체
public class Customer1 {
    private int id;
    private String name;

    public Customer1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ", " + name;
    }
}
