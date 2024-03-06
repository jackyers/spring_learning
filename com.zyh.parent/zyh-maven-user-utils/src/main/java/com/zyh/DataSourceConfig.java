package com.zyh;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author GG_B
 * @version 1.0
 */
public class DataSourceConfig {
    static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDatasource(){
        return dataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
