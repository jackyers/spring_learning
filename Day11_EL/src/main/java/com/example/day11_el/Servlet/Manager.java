package com.example.day11_el.Servlet;

import com.example.day11_el.Project.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author GG_B
 * @version 1.0
 */
@WebServlet("/showData")
public class Manager extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user",new User("李四","女"));
        HttpSession session = req.getSession();


        session.setAttribute("user",new User("张三","男"));
        req.getRequestDispatcher("Manage.jsp").forward(req,resp);
//        resp.sendRedirect("m=Manage.jsp");
    }
}
