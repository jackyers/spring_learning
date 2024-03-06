<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String user = (String) session.getAttribute("username");
    if (user == null){
        //如果会话超时，那么当前用户的session会被回收，，于是这个session的数据就回丢失
        //当用户再次发起请求，服务器会发现传输过来的没有JSESSIONID，就会重新分配一个session
        //而新的session自然没有之前的数据了
        response.sendRedirect("login.jsp");
    }
%>