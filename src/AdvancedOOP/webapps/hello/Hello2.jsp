<html>
<body>
<%-- A JSP Comment --%>
<%@ include file = "H.jsp" %> <%-- include 지시문을 사용해서 끼워넣기 --%>
<% if (hello.equals("hello")) { %>
    <H1>Hello JSP</H1>
<% } else { %>
    <H1>Olleh</H1>
<% } %>
<p>Today: <%= (new java.util.Date()).toLocaleString() %></p>
</body>
</html>