package AdvancedOOP.webapps.src.com.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloWS")
public class HelloServlet extends HttpServlet { 
    private String message;

    public void init() throws ServletException {
        message = "Hello!!!!!!!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
    public void destroy() { /* do nothing */ }
}

/*
javac : 자바 컴파일러 실행 (.java를 .class로 변환)
-cp "$env:CATALINA_HOME/lib/servlet-api.jar" : 컴파일할 때 참조할 라이브러리
-d hello/WEB-INF/classes : 컴파일 결과를 저장할 기준 폴더
-s src : 자동 생성 소스(.java)를 저장할 폴더
src/com/web/HelloServlet.java : 컴파일할 원본 소스 (입력에 해당)
*/