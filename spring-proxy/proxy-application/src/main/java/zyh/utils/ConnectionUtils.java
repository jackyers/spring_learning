package zyh.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author GG_B
 * @version 1.0
 */
public class ConnectionUtils {
    private final ThreadLocal<Connection> tl= new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection(){
        try {
            Connection connection = tl.get();
            if (connection == null){
                connection = dataSource.getConnection();
                tl.set(connection);
            }
            return connection;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
/**
 * 解绑当前连接对象
 */
    public void remoteConnection(){
        tl.remove();
    }

}
