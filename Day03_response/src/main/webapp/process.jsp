<%@ page import="com.sun.research.ws.wadl.Request" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if ("admin".equals(username) && "123".equals(password)){

//        //页面重定向到主页
//        response.sendRedirect("main.jsp");

        //获取一个请求转发的对象（main.jsp），那么这个对象（main.jsp ）
        //会在新的请求中得到这次旧请求的参数
        RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
        //然后调用方法进行转发
        dispatcher.forward(request,response);
        //页面进行跳转之后，地址栏并没有变化
        //说明转发是发生在服务器端
    }
%>