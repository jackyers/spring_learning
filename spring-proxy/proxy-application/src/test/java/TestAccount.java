import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zyh.service.AccountService;

/**
 * @author GG_B
 * @version 1.0
 */
public class TestAccount {
     ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    AccountService accountService = (AccountService) context.getBean("accountService");
    @Test
    public void Test(){
        accountService.transfer("小红","小明",50);

    }
}
