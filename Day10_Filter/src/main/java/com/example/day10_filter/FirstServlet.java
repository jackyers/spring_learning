package com.example.day10_filter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;


/**
 * @author GG_B
 * @version 1.0
 */
public class FirstServlet implements Servlet {
    private ServletConfig servletConfig;
    //Servlet实例在该Servlet处理第一次请求的时候才会创建
    //创建的时候会立刻调用初始化方法
    public FirstServlet() {
        System.out.println("创建FirstServlet实例");
    }

    //Servlet初始化，只有初始化完成后，其才能提供服务。
    @Override
    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
        //获取Servlet所有的配置参数名称
        Enumeration<String> initParameterName = servletConfig.getInitParameterNames();
        while (initParameterName.hasMoreElements()){
            //获取下一个参数
            String parameterName = initParameterName.nextElement();
            //获取既定参数名称的参数
            String parameterValue = servletConfig.getInitParameter(parameterName);
            System.out.println(parameterName + "=>" + parameterValue);
        }
        System.out.println("Servlet初始化完成");
    }


    //获取Servlet配置
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    //处理请求的方法
    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        System.out.println("Servlet处理并做出响应。");
        String characterEncoding = request.getCharacterEncoding();
        System.out.println(characterEncoding);
        System.out.println("开始读取请求中的属性");
        //设置字符集编码
        request.setCharacterEncoding("UTF-8");
        //获取request对象中存储的属性名称
        Enumeration<String> attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements()){
            String attrName = attributeNames.nextElement();
            Object attribute = request.getAttribute(attrName);
            System.out.println(attrName + "=>" + attribute);
        }
        System.out.println("===============");
        System.out.println("开始读取请求中的参数");
        //获取request对象中存储的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String paraName = parameterNames.nextElement();
            String parameter = request.getParameter(paraName);
            System.out.println(paraName + "=>" + parameter);
        }
        System.out.println("==============");
        System.out.println("开始读取请求体中的数据");
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("==============");
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.forEach((k, values) -> System.out.println(k + " => " + Arrays.toString(values)));
        System.out.println("===========================================");
        System.out.println("响应的字符集编码：" + response.getCharacterEncoding());
        response.setCharacterEncoding("UTF-8");
        System.out.println("响应的字符集编码：" + response.getCharacterEncoding());
        System.out.println("响应的内容类型：" + response.getContentType());
        response.setContentType("text/html;charset=utf-8");
        System.out.println("响应的内容类型：" + response.getContentType());
        PrintWriter writer = response.getWriter();
        writer.print("登录请求已处理");//向页面输出数据的输出流
        writer.flush();
        writer.close();
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    //Servlet销毁
    @Override
    public void destroy() {
        System.out.println("Servlet销毁。");
    }
}
