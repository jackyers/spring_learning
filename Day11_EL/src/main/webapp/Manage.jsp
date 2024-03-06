<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理页面</title>
</head>
<body>
<div>
    ${requestScope.user.name} &nbsp;&nbsp;${requestScope.user["sex"]}
</div>
<div>
    ${sessionScope.user.name} &nbsp;&nbsp;${sessionScope.user["sex"]}
</div>
<div>
    ${empty sessionScope.user}
    ${empty sessionScope.data}
</div>
</body>
</html>
