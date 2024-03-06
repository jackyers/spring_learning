package com.example.day10_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * @author GG_B
 * @version 1.0
 * 字符集编码过滤器
 */
@WebFilter(urlPatterns = "/*", initParams = {
        @WebInitParam(name = "encoding" ,value = "UTF-8")
})
public class CharacterEncodingFilter implements Filter {

    private String encoding;

    public CharacterEncodingFilter() {
        System.out.println("CharacterEncodingFilter构造实例");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("过滤器进行过滤处理");
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        //多个过滤器会形成一条过滤器链，当前过滤器完成处理之后，必须调用doFilter方法
        //让下一个过滤器进行处理，所有过滤器处理完成之后，请求才会被送达Servlet
        //若请求不需要Servlet来处理，就不用调用chain.doFilter方法，直接使用response
        //做出相应即可
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
