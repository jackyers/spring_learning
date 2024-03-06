package com.example.day12_jstl.Project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author GG_B
 * @version 1.0
 */
@WebServlet("/showScore")
public class ScoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("张三",new Score("张三","85"));
        resp.sendRedirect("Score.jsp");
    }
}
