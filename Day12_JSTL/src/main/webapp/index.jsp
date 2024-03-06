<%@ page import="com.example.day12_jstl.Project.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JST标签的使用L</title>
</head>
<body>

<%
    User user = new User();
%>
<div>
<%--    相当于在页面创建了一个名为test的变量--%>
    <c:set var="test" value="测试" scope="page" />
    <c:set target="<%=user%>" property="name" value="管理员" />
</div>
<div>
    页面范围内的变量：${pageScope.test}
</div>
    <c:remove var="test" scope="page" />
<div>
    页面范围内的变量：${pageScope.test}
</div>

<div>
    <%=user.getName()%>
</div>
<div>
    <a href="showScore">展示成绩</a>
</div>

</body>
</html>