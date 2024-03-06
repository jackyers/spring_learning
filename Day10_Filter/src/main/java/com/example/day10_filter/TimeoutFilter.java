package com.example.day10_filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author GG_B
 * @version 1.0
 */
//若配置为"/*"，那么所有请求都会被拦截，包括登录，于是还没登录就超时了
//所以在过滤之前，对某些请求方放行
@WebFilter("/*")
public class TimeoutFilter extends HttpFilter {
//    @Override
//    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpSession session = request.getSession();
//        Object user = session.getAttribute("user");
//        if (user == null){
//            //登录超时，跳转至登录页面
//            response.sendRedirect("second.jsp");
//        }else {
//            //登录没有超时，下一个过滤器开始处理
//            chain.doFilter(request,response);
//        }
//    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
//session中没有数据了，说明session已经过期了，当前的session是一个新的session
        if(username == null){
//首页的地址 就是上下文路径
            String homePageUrl = request.getContextPath();
            if("".equalsIgnoreCase(homePageUrl)){//上下文路径为空字符串时给一条斜杠即可
                        homePageUrl = "/";
            }
            response.sendRedirect(homePageUrl);
        } else {
//让过滤器链中的其他过滤器执行，这行代码必不可少，否则，无法进入后面的Servlet执行
            chain.doFilter(request, response);
        }
    }
    }

