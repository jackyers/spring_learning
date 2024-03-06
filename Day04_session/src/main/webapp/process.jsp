<%@ page import="com.sun.research.ws.wadl.Request" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if ("admin".equals(username) && "123".equals(password)){
        //将用户名和密码存储在session中，session是唯一标识某一个用户
        session.setAttribute("username",username);
        session.setAttribute("password",password);
        //设置session的超时时间为5秒
        session.setMaxInactiveInterval(5);
        //页面重定向到主页
        response.sendRedirect("main.jsp");
    }
%>