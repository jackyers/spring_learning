import config.JdbcConfig;
import config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zyh.pojo.Account;
import zyh.service.AccountService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
//使用到的测试启动器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JdbcConfig.class})
public class TestJunit {
    @Resource
    AccountService accountService;
    @Test
    public void Test(){
        List<Account> accounts = accountService.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }
}
