package AdvancedOOP.JDBC_DAO.DAO.고객정보DAO;

// DB의 한 행을 담는 JAVA 객체
public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    // insert 용도로 사용됨!
    public Customer(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // 조회 하는 경우에는 id가 이미 존재!
    public Customer(int id, String name, String email, String phone, String address) {
        this(name, email, phone, address);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "" + id + ":" + name + " " + phone + " " + email;
    }
}
