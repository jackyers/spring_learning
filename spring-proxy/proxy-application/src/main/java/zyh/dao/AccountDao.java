package zyh.dao;

import zyh.pojo.Account;

/**
 * @author GG_B
 * @version 1.0
 */
public interface AccountDao {
    public Account findAccountByName(String name);
    public void updateAccount(Account account);
}
