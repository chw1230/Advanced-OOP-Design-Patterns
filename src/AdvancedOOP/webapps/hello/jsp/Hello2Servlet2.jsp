<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>사용자 조회</title>
</head>
<body>
	<h1>사용자 조회</h1>
	<%-- 입력값(user, email, phone)을 GET 파라미터로 MyServlet에 전송, 서블릿에서는 셋 다 getParameter()로 꺼냄 --%>
    <form action="/hello/myservlet" method="get">
		<label for="user">사용자명:</label>
		<input type="text" name="user"><br>
		<label for="email">Email:</label>
		<input type="text" name="email"><br>
		<label for="phone">Phone:</label>
		<input type="text" name="phone"><br>		
		<button type="submit">조회</button>
	</form>
</body>
</html>
