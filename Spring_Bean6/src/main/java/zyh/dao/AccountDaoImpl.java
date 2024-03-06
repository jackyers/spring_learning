package zyh.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;
import zyh.pojo.Account;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @author GG_B
 * @version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao{
    @Resource
    private QueryRunner runner;
    public Account findAccountByName(String name) {
        try {
            String sql = "select * from account where name = ?";
//            List<Account> list = runner.query(sql, new BeanListHandler<Account>(Account.class),name);
//            if (list == null || list.isEmpty())
//            {
//                return null;
//            }
//            if (list.size() > 1){
//                throw new RuntimeException();
//            }
//            return list.get(0);
            Account account = runner.query(sql,new BeanHandler<Account>(Account.class),name);
            return account;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        String sql = "update account set money = ? where name = ?";
        try {
            runner.update(sql,account.getMoney(),account.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
