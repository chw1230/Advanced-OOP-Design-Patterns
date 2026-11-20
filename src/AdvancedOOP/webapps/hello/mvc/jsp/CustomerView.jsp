<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.my.order.Customer" %>
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
            <% List<Customer> customerList = (List<Customer>) request.getAttribute("CustomerList"); %>
            <% for (Customer customer : customerList) { %>
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