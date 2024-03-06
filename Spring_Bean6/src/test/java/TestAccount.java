import config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zyh.service.AccountService;

import javax.annotation.Resource;

/**
 * @author GG_B
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TestAccount {
    @Resource
    AccountService accountService;
    @Test
    public void Test(){
        accountService.transfer("小红","小明",50);

    }
}
