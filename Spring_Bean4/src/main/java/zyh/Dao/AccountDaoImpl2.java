package zyh.Dao;

import org.springframework.stereotype.Repository;

/**
 * @author GG_B
 * @version 1.0
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao{
    public void addAccount() {
        System.out.println("又成功新增用户了");
    }
}
