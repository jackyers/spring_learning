package com.example.day13_listener.Listener;

import com.example.day13_listener.Util.JdbcUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author GG_B
 * @version 1.0
 */
@WebListener
public class ApplicationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet上下文初始化");
        //获取Servlet上下文
        ServletContext context = sce.getServletContext();
        String jdbcConfig = context.getInitParameter("jdbcConfig");
        InputStream is = this.getClass().getResourceAsStream(jdbcConfig);
        Properties props = new Properties();
        try {
            props.load(is);
            //对数据源进行初始化操作
            JdbcUtil.initDataSource(props);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet上下文销毁");
        JdbcUtil.destroyDataSource();
    }
}
