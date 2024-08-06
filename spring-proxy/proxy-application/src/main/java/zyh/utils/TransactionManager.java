package zyh.utils;

import java.sql.SQLException;

/**
 * @author GG_B
 * @version 1.0
 */
public class TransactionManager {
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /*开启事务*/
    public void beginTransaction(){
        try {
//            绑定当前的线程连接，关闭事务的自动提交
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
/*提交事务*/
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*回滚事务*/
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.remoteConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
