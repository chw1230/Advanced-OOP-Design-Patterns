<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.my.website9.PasswordInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Manager</title>
</head>

<body>
    <h2>비밀번호 관리</h2>
    <form action="<%= request.getContextPath() %>/password" method="post">
      URL :
      <input type="text" name="url">
      ID :
      <input type="text" name="id">
      PW :
      <input type="password" name="password">
      <input type="submit" value="추가">
    </form>
    <br>
    <hr>
    <table border="1">
      <tr>
        <th>URL</th>
        <th>ID</th>
        <th>Password</th>
      </tr>
        <% List<PasswordInfo> list = (List<PasswordInfo>) request.getAttribute("list");
           if (list != null) { 
               for(PasswordInfo p : list) {
        %>
                    <tr>
                      <td><%= p.getUrl() %></td>
                      <td><%= p.getId() %></td>
                      <td><%= p.getPassword() %></td>
                    </tr>
        <%
               }
           }
        %>
</table>
</body>
</html>