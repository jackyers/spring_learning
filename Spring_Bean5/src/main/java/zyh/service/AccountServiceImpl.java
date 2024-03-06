package zyh.service;

import org.springframework.stereotype.Service;
import zyh.dao.AccountDao;
import zyh.pojo.Account;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Resource(name = "accountDao")
    private AccountDao accountDao;

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
