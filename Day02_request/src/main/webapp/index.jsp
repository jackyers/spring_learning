<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>request内置对象</title>
</head>
<body>
<form action="info.jsp" method="post">
    <div><span>用户名</span><input type="text" name="username"></div>
    <div><span>密码</span><input type="password" name="password"></div>
    <div>
        <span>信息来源</span>
        <input type="checkbox" name="channel" value="报刊">报刊
        <input type="checkbox" name="channel" value="网络">网络
        <input type="checkbox" name="channel" value="朋友推荐">朋友推荐
        <input type="checkbox" name="channel" value="电视">电视
    </div>
    <div>
        <input type="submit" value="注册">
        <input type="reset" value="重置">
    </div>
</form>
</body>
</html>