package zyh.Dao;

import org.springframework.stereotype.Repository;

/**
 * @author GG_B
 * @version 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{
    public void addAccount() {
        System.out.println("成功新增Account");
    }
}
