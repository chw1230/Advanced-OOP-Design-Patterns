package AdvancedOOP.webapps.src.com.web;

import AdvancedOOP.webapps.src.com.my.order.Customer;
import AdvancedOOP.webapps.src.com.my.order.CustomerDAO;
import AdvancedOOP.webapps.src.com.my.order.CustomerDAOImpl;
import AdvancedOOP.webapps.src.com.my.order.SQLiteConnector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/QueryCustomer")
public class QueryCustomerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Query Response</title></head>");
        out.println("<body>");

        SQLiteConnector sqlite = new SQLiteConnector();
        try {
            String relativePath = "/WEB-INF/data/customer.db";
            String absolutePath = getServletContext().getRealPath(relativePath);        
            CustomerDAO customerDAO = new CustomerDAOImpl(sqlite.connect(absolutePath));
            // Get all customers from the database
            List<Customer> customers = customerDAO.getAllCustomers();
            out.println("<h3>Here goes the list of customers:</h3>");
            for(Customer customer : customers)
                out.printf("%3d: %10s<BR>", customer.getId(), customer.getName());
                //out.printf("%3d: %10s\n", customer.getId(), customer.getName());
            //out.println("<End>");
        } 
        catch(Exception ex) {
            out.println("<p>Error: " + ex.getMessage() + "</p>");
            out.println("<p>Check Tomcat console for details.</p>");
            ex.printStackTrace();
        }
        finally {
            sqlite.close();
        }
        out.println("</body></html>");
        out.close();
    }
}
