package com.example.day08_httpservlet;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author GG_B
 * @version 1.0
 */
public class secondServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("请求头部信息");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);
            System.out.println(headerName + "=>" + headerValue);
        }
        System.out.println("===============");
        String contextPath = req.getContextPath();//获取上下文路径
        System.out.println("上下文路径：" + contextPath);
        String requestURI = req.getRequestURI();//获取包含上下文路径的请求地址
        requestURI = requestURI.replace(contextPath,"");
        System.out.println("当前请求的路径：" + requestURI);
        System.out.println();
        System.out.println("开始响应");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        PrintWriter writer = null;
        try {
            writer = resp.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("请求已处理");
        writer.flush();
        writer.close();
    }

}

