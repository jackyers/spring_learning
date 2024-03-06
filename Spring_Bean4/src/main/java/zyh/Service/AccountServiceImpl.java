package zyh.Service;

import zyh.Dao.AccountDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GG_B
 * @version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Resource(name = "accountDao2")
    AccountDao accountDao;
    public void addAccount() {
        accountDao.addAccount();
    }
}
