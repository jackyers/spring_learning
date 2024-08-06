package zyh.service;

import zyh.dao.AccountDao;
import zyh.pojo.Account;

/**
 * @author GG_B
 * @version 1.0
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String sourceName, String targetName, double money) {
//        判断转出账户是否足够存在
        Account sourceAccount = accountDao.findAccountByName(sourceName);
//        判断转入账户是否存在
        Account targetAccount = accountDao.findAccountByName(targetName);
        if (sourceAccount != null && targetAccount != null) {
//        判断转出账户余额是否足够
            if (sourceAccount.getMoney() >= money) {
//                更新账户余额
                sourceAccount.setMoney(sourceAccount.getMoney() - money);
                targetAccount.setMoney(targetAccount.getMoney() + money);
//                更新数据库信息
                accountDao.updateAccount(sourceAccount);
//用于测试事务控制
                int i = 1/0;
                accountDao.updateAccount(targetAccount);
            }
        }
    }
}
