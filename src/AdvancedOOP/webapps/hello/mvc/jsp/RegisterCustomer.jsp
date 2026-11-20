<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">	
	<title>사용자 등록</title>
</head>
<body>
	<h1>사용자 등록</h1>
	<form action="/hello/register" method="post">
        <label for="name">사용자 이름:</label>
        <input type="text" name="name" required><br>
        <label for="email">이메일:</label>
        <input type="email" name="email" required><br>
        <label for="address">주소:</label>
        <input type="address" name="address" required><br>
        <label for="phone">전화번호:</label>
        <input type="telephone" name="phone" required><br>
        <button type="submit">등록</button>
	</form>
</body>
</html>