<%@ page import="com.sun.research.ws.wadl.Request" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String rememberMe = request.getParameter("rememberMe");
    if ("admin".equals(username) && "123".equals(password)){
        session.setAttribute("username",username);
        //只有用户登录成功之后，且勾选了“记住我”的情况下，才会记住账号密码
        if (!"on".equals(rememberMe)){//勾选了密码
            username = "";
            password = "";
            rememberMe = "";

        }
        Cookie usernameCookie = new Cookie("username",username);
        Cookie passwordCookie = new Cookie("password",password);
        Cookie rememberMeCookie = new Cookie("rememberMe",rememberMe);
        //“记住我”属于服务端对客户端否一种相响应。
        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);
        response.addCookie(rememberMeCookie);

        response.sendRedirect("main.jsp");
    }
%>