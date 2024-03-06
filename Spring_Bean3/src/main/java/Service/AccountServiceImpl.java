package Service;

import Dao.AccountDao;
import pojo.Account;

import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(String accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(String accountId) {
        accountDao.deleteAccount(accountId);
    }
}
