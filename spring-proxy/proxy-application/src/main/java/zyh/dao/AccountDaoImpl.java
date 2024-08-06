package zyh.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import zyh.pojo.Account;
import zyh.utils.ConnectionUtils;

import java.sql.SQLException;

/**
 * @author GG_B
 * @version 1.0
 */
public class AccountDaoImpl implements AccountDao{
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public Account findAccountByName(String name) {
        try {
            String sql = "select * from account where name = ?";
            Account account = runner.query(connectionUtils.getThreadConnection(),sql,new BeanHandler<Account>(Account.class),name);
            return account;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        String sql = "update account set money = ? where name = ?";
        try {
            runner.update(connectionUtils.getThreadConnection(),sql,account.getMoney(),account.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
