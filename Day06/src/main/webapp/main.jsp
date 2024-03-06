<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="timeout.jsp"%>
<%
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    String sessionId = session.getId();
%>
<div>response的数据类型：<%=response.getClass().getName()%></div>
<div>session的数据类型：<%=session.getClass().getName()%></div>
<div>sessionId：<%=sessionId%></div>
<div>用户名：<%=username%></div>
<div>密码：<%=password%></div>