package zyh.service;

import org.springframework.stereotype.Service;
import zyh.pojo.Account;
import zyh.dao.AccountDao;

import javax.annotation.Resource;

/**
 * @author GG_B
 * @version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService{
    @Resource
    private AccountDao accountDao;
    public void transfer(String sourceName, String targetName, double money) {
        Account sourceAccount = accountDao.findAccountByName(sourceName);
        Account targetAccount = accountDao.findAccountByName(targetName);
        if (sourceAccount != null && targetAccount != null){
            if (sourceAccount.getMoney() >= money){
                sourceAccount.setMoney(sourceAccount.getMoney() - money);
                targetAccount.setMoney(targetAccount.getMoney() + money);
                accountDao.updateAccount(sourceAccount);
                accountDao.updateAccount(targetAccount);
            }
        }
    }
}
