<%@ page language = "java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ page import = "java.util.Date" %>
<html>
<body>
<% out.print("Hello JSP"); %>
<p>Today: <%= (new Date()).toLocaleString()%></p>
<% out.print("request URI: " + request.getRequestURI()); %>
<br>
<% out.print("response Status: " + response.getStatus()); %>
<br>
<%
    pageContext.setAttribute("user", "홍상명", PageContext.SESSION_SCOPE);
    String name = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
    out.print("pageContext: Hello " + name);
%>
<br>
<%
    //if (session.isNew()) {
    Date createTime = new Date(session.getCreationTime());
    out.println("session createTime: " + createTime);
    //}
%>
<br>
<% out.print("application server: " + application.getServerInfo()); %>
<br>
</body>
</html>

<%-- JSP 내장 객체를 사용한 예제 --%>