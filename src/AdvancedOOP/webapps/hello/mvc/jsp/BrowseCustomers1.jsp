<%-- 한 곳에서 DB 드라이버 등록, 연결, 조회해서 페이지에 출력하는 것을 한 개에서 모두 처리하는 방식 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.ServletContext" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.my.order.Customer" %>
<%
    List<Customer> customers = new ArrayList<Customer>();
    ServletContext context = session.getServletContext(); // 서블렛 컨텍스트를 얻음(웹 애플리케이션)
    String relativePath = "/WEB-INF/data/mvc/customer.db";    // 웹 애플리케이션 기준 상대 경로
    String absolutePath = getServletContext().getRealPath(relativePath); // 절대 경로 얻음
    out.println(absolutePath); // 절대 경로 확인을 위해 페이지에 출력
    try {    
        Class.forName("org.sqlite.JDBC"); // 드라이버 등록. 웹 애플리케이션에서는 명시적 등록이 필요함
        String sql = "SELECT * FROM customers";          
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + absolutePath);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql)) {            
            while (rs.next()) {
                String _name = rs.getString("name");
                String _address = rs.getString("address");
                String _email = rs.getString("email");
                String _phone = rs.getString("phone");
                customers.add(new Customer(_name, _email, _phone, _address));
            }
        }
    } 
    catch (Exception e) {
        java.io.StringWriter sw = new java.io.StringWriter();
        java.io.PrintWriter pw = new java.io.PrintWriter(sw);
        e.printStackTrace(pw);
        out.println("<pre>" + sw.toString() + "</pre>");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 목록</title>
</head>
<body>
    <h1>고객 정보 목록</h1>
    <table border="1" cellpadding="5">
        <thead>
            <tr>
                <th>이름</th>
                <th>주소</th>
                <th>이메일</th>
                <th>전화</th>
            </tr>
        </thead>
        <tbody>
            <% for (Customer customer : customers) { %>
            <tr>
                <td><%= customer.getName() %></td>
                <td><%= customer.getAddress() %></td>
                <td><%= customer.getEmail() %></td>
                <td><%= customer.getPhoneNumber() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>