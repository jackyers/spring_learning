<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>
<div>用户名：<%=username%></div>
<div>密码：<%=password%></div>