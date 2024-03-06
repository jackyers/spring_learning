<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩展示页面</title>
</head>
<body>
<c:if test="${sessionScope.张三.score > 80}" var="result" scope="request">
    <div>成绩高于80</div>
</c:if>
<div>成绩高于80吗？ ${requestScope.result}</div>

<c:choose>
    <c:when test="${sessionScope.张三.score >90}">
        <div>成绩优秀</div>
    </c:when>
    <c:when test="${sessionScope.张三.score >80}">
        <div>成绩良好</div>
    </c:when>
    <c:when test="${sessionScope.张三.score >70}">
        <div>成绩中等</div>
    </c:when>
    <c:when test="${sessionScope.张三.score >60}">
        <div>成绩及格</div>
    </c:when>
    <c:otherwise>
        <div>成绩不及格</div>
    </c:otherwise>
</c:choose>
<fmt:formatDate value="${sessionScope.张三.examDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
货币格式的数字：<fmt:formatNumber value="5550" type="currency" /><br>
数字格式化：<fmt:formatNumber value="3367.5463" type="number" maxIntegerDigits="5" maxFractionDigits="3"/><br>
数字格式化：<fmt:formatNumber value="6654.321" type="number" pattern="####.##" /><br>
数字百分比：<fmt:formatNumber value="6663.5684" type="percent" maxIntegerDigits="5" maxFractionDigits="2"/><br>
</body>
</html>
