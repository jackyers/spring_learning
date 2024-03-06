import Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */

public class TestAccount {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = context.getBean("accountService", AccountService.class);
        List<Account> accounts= as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }
}
