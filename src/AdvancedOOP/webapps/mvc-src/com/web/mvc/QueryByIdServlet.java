package com.web.mvc;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.my.order.Customer;
import com.my.order.CustomerDAO;
import com.my.order.CustomerDAOImpl;
import com.my.order.SQLiteConnector;

@WebServlet("/QueryById")
public class QueryByIdServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("customerId"));
        ServletContext context = getServletContext(); // 서블렛 컨텍스트를 얻음(웹 애플리케이션)
        String relativePath = "/WEB-INF/data/mvc/customer.db";    // 웹 애플리케이션 기준 상대 경로
        String absolutePath = getServletContext().getRealPath(relativePath); // 절대 경로 얻음
        try {
            SQLiteConnector sqlite = new SQLiteConnector();
            CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(absolutePath));
            Customer customer = customerDAO.getCustomerById(id);
            sqlite.close();
            request.setAttribute("Customer", customer); // JSP로 customer 객체 전달
            String jspPath = "/mvc/jsp/QueryById.jsp";
            getServletContext().getRequestDispatcher(jspPath).forward(request, response);            
        } 
        catch(Exception e) {
            e.printStackTrace();
        }
   }
}

/*
QueryByIdServlet1.java와는 다르게 MVC 분리되어 고객번호를 입력받고 조회하는 것을 볼 수 있음!
 */