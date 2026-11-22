package com.web.website9;

import com.my.website9.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/password")
public class WebSite9Servlet extends HttpServlet {
    private String dbPath;

    @Override
    public void init() {
        dbPath = getServletContext().getRealPath("/WEB-INF/data/mvc/passwordInfo.db");
        PasswordInfoTableCreator.createNewDatabase(dbPath); // 테이블은 최초 1회만
    }

    // 목록 조회 → list.jsp로 forward
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SQLiteConnector sqlite = new SQLiteConnector();
        try {
            PasswordDAO dao = new PasswordDAOImpl(sqlite.connect(dbPath));
            List<PasswordInfo> list = dao.findAll();
            request.setAttribute("list", list); // list.jsp의 getAttribute("list")와 키를 맞춤
        } finally {
            sqlite.close();
        }
        getServletContext().getRequestDispatcher("/mvc/jsp/list.jsp").forward(request, response);
    }

    // 데이터 추가 -> 다시 목록으로 redirect (PRG 패턴)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // getParameter보다 먼저 호출해야 함
        String url = request.getParameter("url");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        SQLiteConnector sqlite = new SQLiteConnector();
        try {
            PasswordDAO dao = new PasswordDAOImpl(sqlite.connect(dbPath));
            dao.insert(new PasswordInfo(url, id, password));
        } catch (RuntimeException e) {
            e.printStackTrace();   // 같은 url이 이미 있으면 PRIMARY KEY 위반
        } finally {
            sqlite.close();
        }
        response.sendRedirect(request.getContextPath() + "/password");
    }
}
