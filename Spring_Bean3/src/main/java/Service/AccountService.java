package Service;

import pojo.Account;

import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public interface AccountService {
    List<Account> findAllAccount();
    Account findAccountById(String accountId);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(String accountId);
}
