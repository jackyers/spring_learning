<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.nio.charset.StandardCharsets" %><%--
  Created by IntelliJ IDEA.
  User: Yuhao Zhu
  Date: 2023/11/15
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //防止post时中文出现乱码
    //设置请求时的字符集的编码格式，
    request.setCharacterEncoding("UTF-8");
    //从请求中获取参数username的值
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    String[] channels = request.getParameterValues("channel");

    for (String channel:channels) {
        //防止使用get方法时，中文出现乱码
        //在ISO_8859_1这种编码格式下获取字符串的字节数据
        byte[] bytes = channel.getBytes(StandardCharsets.ISO_8859_1);
        //通过字符串的构造方法进行编码转换
        String s = new String(bytes,StandardCharsets.UTF_8);
    }
    //总之，中文容易在post和get方法的使用下出现乱码，
%>
<div><%=username%></div>
<div><%=password%></div>
<div><%=Arrays.toString(channels)%></div>
