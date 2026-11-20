package com.web.mvc;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.my.order.Customer;
import com.my.order.CustomerDAO;
import com.my.order.CustomerDAOImpl;
import com.my.order.SQLiteConnector;

@WebServlet("/QueryById1")
public class QueryByIdServlet1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("customerId"));

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Query Results</title></head>");
        out.println("<body>");

        ServletContext context = getServletContext(); // 서블렛 컨텍스트를 얻음(웹 애플리케이션)
        String relativePath = "/WEB-INF/data/mvc/customer.db";    // 웹 애플리케이션 기준 상대 경로
        String absolutePath = getServletContext().getRealPath(relativePath); // 절대 경로 얻음
        try {
            // Model의 일을 DAO에게 맡김
            SQLiteConnector sqlite = new SQLiteConnector();
            CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(absolutePath));
            Customer customer = customerDAO.getCustomerById(id);
            out.printf("CustomerByID: %d\n이름: %s\n주소: %s\n이메일: %s\n전화: %s", customer.getId(),
                       customer.getName(), customer.getAddress(), customer.getEmail(), customer.getPhoneNumber());
            out.println("<h3>Thank you for your query.</h3>");
            sqlite.close();
        } 
        catch(Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
            out.println("<p>Check Tomcat console for details.</p>");
            e.printStackTrace();
        }
        out.println("</body></html>");
        out.close();
   }
}

/*
이번 코드는 Model - DAO로 분리 했지만, view - 서블릿이 직접 출력하고 있음 ( 분리안함 )
 */