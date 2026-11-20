package AdvancedOOP.webapps.src.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

// 실습: JSP 페이지와 서블릿 연동 + HTML 폼과 서블릿 연동에서 함께 사용
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // JSP에서 request.setAttribute("user", ...)로 넘기면 attribute,
        // HTML 폼에서 넘기면 parameter로 들어옴 -> 둘 다 처리
        Object user = request.getAttribute("user");
        if (user == null) {
            user = request.getParameter("user");
        }

        out.println("<B><BR>User:" + user);
        out.println(", Email:" + request.getParameter("email"));
        out.println(", Phone:" + request.getParameter("phone") + "</B>");

        // hello/jsp/Hello.jsp 연결
        this.getServletContext()
            .getRequestDispatcher("/jsp/Hello.jsp")
            .include(request, response);
    }
}
