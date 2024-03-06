import config.SpringConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zyh.pojo.Account;
import zyh.service.AccountService;

import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */

public class TestAccount {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = context.getBean("accountService", AccountService.class);
        List<Account> accounts= as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }

        QueryRunner runner1 = (QueryRunner) context.getBean("runner");
        QueryRunner runner2 = (QueryRunner) context.getBean("runner");
        System.out.println(runner1 == runner2);


    }
}
