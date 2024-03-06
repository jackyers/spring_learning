package com.example.day13_listener.Util;

import com.alibaba.druid.pool.DruidDataSource;

import java.util.Properties;

/**
 * @author GG_B
 * @version 1.0
 */
public class JdbcUtil {
    private static final DruidDataSource dataSource = new DruidDataSource();
    //初始化数据源
    public static void initDataSource(Properties properties){
        dataSource.configFromPropety(properties);
    }
    //关闭数据源
    public static void destroyDataSource(){
        dataSource.close();
    }
}
