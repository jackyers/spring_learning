<%--import指令用来导入包--%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎来到01大学</title>
</head>
<body>
<%
    //这里是JSP小脚本，支持Java代码
    Date now = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String currentTime = format.format(now);
%>
    今天是
<%=
    //这里可以引用变量
   currentTime
%>

<%!
    //这里可以定义方法
    String date2str(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
%>

这是用方法展示的时间：
<%=
    date2str(new Date())
%>

//注意看循环的分号，那里是一个整体。
<%
    String[] names = {"张三","李四","王五"};
%>

<%
    for (String name:names){
%>
<div><%= name%></div>
<%
    }
%>

</body>
</html>