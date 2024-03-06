<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session内置对象</title>
</head>
<%
    String username = "",password = "";
    boolean rememberMe = false;
    //从请求中获取cookie的值
    Cookie[] cookies = request.getCookies();
    if (cookies != null){
        for (Cookie c:cookies) {
            String name = c.getName();
            if ("username".equals(name)){
                username = c.getValue();
            } else if ("password".equals(name)) {
                password = c.getValue();
            } else if ("rememberMe".equals(name)) {
                rememberMe = "on".equals(c.getValue());
            }
        }
    }
%>
<body>
    <form action="process.jsp" method="post" >
        <div><span>用户名</span><input type="text" name="username" value="<%=username%>"></div>
        <div><span>密码</span><input type="password" name="password" value="<%=password%>"></div>
        <div><input type="checkbox" name="rememberMe" <%=rememberMe ? "checked" : " "%>>记住我</div>
        <div>
            <input type="submit" value="登录">
        </div>
    </form>
</body>
</html>
