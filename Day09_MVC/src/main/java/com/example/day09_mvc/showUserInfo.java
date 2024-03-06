package com.example.day09_mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author GG_B
 * @version 1.0
 */
//这个注解表示该类是一个Servlet，不用在Web.xml中再次配置
@WebServlet("/showUserInfo")
public class showUserInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //此处演示的只是简单模型，在实际开发中，数据都是从业务处理层DAO处获取，然后组装完成整个模型
        User user = new User("张三","男","18");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println(user.toString());
        writer.flush();
        writer.close();

    }
}
