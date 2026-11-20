package com.web.mvc;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.my.order.Customer;
import com.my.order.CustomerDAO;
import com.my.order.CustomerDAOImpl;
import com.my.order.SQLiteConnector;

@WebServlet("/register")
public class RegisterCustomerServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");  
        String email = request.getParameter("email");  
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Query Response</title></head>");
        out.println("<body>");

        SQLiteConnector sqlite = new SQLiteConnector();
        try {
            String relativePath = "/WEB-INF/data/mvc/customer.db";
            String absolutePath = getServletContext().getRealPath(relativePath);        
            CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(absolutePath));
            // 데이터베이스에 새로운 고객 정보 추가
            Customer newCustomer = new Customer(name, email, phone, address);
            customerDAO.addCustomer(newCustomer);
            out.print("<BR>고객 정보가 등록됨...");

        } catch(Exception ex) {
            out.println("<p>오류: " + ex.getMessage() + "</p>");
            out.println("<p>더 자세한 내용은 Tomcat 콘솔을 확인할 것</p>");
            ex.printStackTrace();
        } finally {
            sqlite.close();   // 성공하든 에러가 나든 항상 실행됨
        }

        out.println("</body></html>");
        out.close();
    }
}