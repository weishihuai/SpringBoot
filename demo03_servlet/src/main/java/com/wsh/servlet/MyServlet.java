package com.wsh.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wsh on 2017/12/4.
 * SpringBoot 使用注解方式注册Servlet
 */
@WebServlet(urlPatterns = "/myServlet/*",description = "servlet使用说明")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>SpringBoot使用注解方式注册Servlet</title>");
        printWriter.println("<body>");
        printWriter.println("<h1>这是MyServlet</h1>");
        printWriter.println("</body>");
        printWriter.println("</head>");
        printWriter.println("</html>");
    }
}

