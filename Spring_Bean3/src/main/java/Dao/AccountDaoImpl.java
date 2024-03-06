package Dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public class AccountDaoImpl implements AccountDao{
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account findAccountById(String accountId) {
        try {
            return runner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),accountId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            runner.update("insert into account (name,money) values (?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        try {
            runner.update("update account set name = ?,money = ? where id = ?",account.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(String accountId) {
        try {
            runner.update("delete from account where id = ?",accountId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
