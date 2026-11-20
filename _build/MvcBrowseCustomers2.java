package com.web.mvc;

import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.my.order.Customer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/mvc/BrowseCustomers2")
public class BrowseCustomers2 extends HttpServlet {    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<Customer>();
        ServletContext context = getServletContext(); // 서블렛 컨텍스트를 얻음(웹 애플리케이션)
        String relativePath = "/WEB-INF/data/mvc/customer.db";    // 웹 애플리케이션 기준 상대 경로
        String absolutePath = getServletContext().getRealPath(relativePath); // 절대 경로 얻음
        try {
            Class.forName("org.sqlite.JDBC"); // 드라이버 등록. 웹 애플리케이션에서는 명시적 등록이 필요함
            String sql = "SELECT * FROM customers";          
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + absolutePath);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {            
                while (rs.next()) {
                    String _name = rs.getString("name");
                    String _address = rs.getString("address");
                    String _email = rs.getString("email");
                    String _phone = rs.getString("phone");
                    customers.add(new Customer(_name, _email, _phone, _address));
                }
                String jspPath = "/mvc/jsp/CustomerView.jsp";
                request.setAttribute("CustomerList", customers); // JSP로 리스트 전달
                getServletContext().getRequestDispatcher(jspPath).forward(request, response);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}