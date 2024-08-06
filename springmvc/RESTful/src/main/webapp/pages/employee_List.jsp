<%--
  Created by IntelliJ IDEA.
  User: Yuhao Zhu
  Date: 2024/3/19
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示员工信息</title>
</head>
<body>
<table bgcolor="orange" width="600px" height="200px"
       align="center" cellpadding="1" cellspacing="1">
    <tr align="center" bgcolor="white">
        <th colspan="5">员工信息</th>
    </tr>
    <tr align="center" bgcolor="white">
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>操作(<a href="#">add</a>)</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr align="center" bgcolor="white">
            <td>${employee.id}</td>
            <td>${employee.lastName}</td>
            <td>${employee.email}</td>
            <td>${employee.gender}</td>
            <td>
                <input type="submit" value="删除">
                <input type="submit" value="更新">
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
