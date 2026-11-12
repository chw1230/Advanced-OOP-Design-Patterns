<html>
<body>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="hello" value="hello there" />
<c:out value="${hello}" />
<p>Today: <%= (new java.util.Date()).toLocaleString() %></p>
</body>
