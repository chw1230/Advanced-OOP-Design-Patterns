<html>
<body>
<%-- A JSP Comment --%>
<%! String hello = "hello"; %>
<% if (hello.equals("hello")) { %>
    <H1>Hello JSP</H1>
<% } else { %>  <%-- if의 끝과 else를 한 줄에 씀 --%>
    <H1>Olleh</H1>
<% } %>
<p>Today: <%= (new java.util.Date()).toLocaleString() %></p>
</body>
</html>