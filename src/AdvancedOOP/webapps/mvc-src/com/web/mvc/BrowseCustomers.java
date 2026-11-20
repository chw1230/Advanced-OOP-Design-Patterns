package com.web.mvc;

import java.io.*;
import java.util.List;

import com.my.order.Customer;
import com.my.order.CustomerDAO;
import com.my.order.CustomerDAOImpl;
import com.my.order.SQLiteConnector;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/mvc/BrowseCustomers")
public class BrowseCustomers extends HttpServlet {    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext(); // 서블렛 컨텍스트를 구함        
        String relativePath = "/WEB-INF/data/mvc/customer.db";        
        String absolutePath = context.getRealPath(relativePath); // 절대 경로 얻음        
        try {
            SQLiteConnector sqlite = new SQLiteConnector();
            CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(absolutePath));
            List<Customer> customers = customerDAO.getAllCustomers(); // Model에게 시키기만 하는 구조로 변경

            String jspPath = "/mvc/jsp/CustomerView.jsp";
            request.setAttribute("CustomerList", customers); // JSP로 리스트 전달
            context.getRequestDispatcher(jspPath).forward(request, response);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
이전에 실습한 DAO를 활용해서 Model을 분리하여 MVC 패턴을 사용
 */