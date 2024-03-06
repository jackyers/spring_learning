package com.example.day07_servlet_copy;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.Enumeration;

/**
 * @author GG_B
 * @version 1.0
 */
@WebServlet("/login")
public class LoginServlet implements Servlet {
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        String servletName = config.getServletName();
        System.out.println("Servlet 实例的名称：" + servletName);
//获取Servlet中所有的初始化参数
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String initParameterName = initParameterNames.nextElement();
//获取Servlet中给定名称的初始化参数
            String initParameterValue =
                    config.getInitParameter(initParameterName);
            System.out.println("Servlet 初始化参数 " + initParameterName + ":" +
                    initParameterValue);
        }
    }
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse
    servletResponse) throws ServletException, IOException {
        System.out.println("Servlet 处理请求");
    }
    @Override
    public String getServletInfo() {
        return "Login Servlet";
    }
    @Override
    public void destroy() {
        System.out.println("Servlet 销毁");
    }
}


