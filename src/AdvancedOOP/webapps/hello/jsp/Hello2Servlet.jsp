<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<HTML>
<HEAD> <H1>Passing User Info to Servlet</H1></HEAD>
<BODY>
<%-- user: request 객체에 attribute로 담음 -> 서블릿에서 getAttribute("user")로 꺼냄 (Object 가능) --%>
<% request.setAttribute("user", "홍지문"); %>

<%-- MyServlet을 서버 내부에서 include로 호출 (주소창 안 바뀜), flush=true: 제목을 먼저 출력 --%>
<%-- email, phone: jsp:param으로 붙임 → 서블릿에서 getParameter()로 꺼냄 (String만 가능) --%>
<jsp:include page="/myservlet" flush="true">
    <jsp:param name="email" value="jmhong@smu.ac.kr" />
    <jsp:param name="phone" value="01012345678" />
</jsp:include>
</BODY>
</HTML>