<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.my.order.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디로 조회된 고객 정보</title>
</head>
<body>
    <h1>고객 정보</h1>
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
            <% Customer customer = (Customer) request.getAttribute("Customer"); %>
            <tr>
                <td><%= customer.getName() %></td>
                <td><%= customer.getAddress() %></td>
                <td><%= customer.getEmail() %></td>
                <td><%= customer.getPhoneNumber() %></td>
            </tr>
        </tbody>
    </table>
</body>
</html>