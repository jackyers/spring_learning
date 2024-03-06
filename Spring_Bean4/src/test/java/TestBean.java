import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zyh.Dao.AccountDao;
import zyh.Service.AccountService;

/**
 * @author GG_B
 * @version 1.0
 */
public class TestBean {
    @Test
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AccountDao accountDao = (AccountDao) context.getBean("accountDao");
        accountDao.addAccount();

        AccountDao accountDao2 = (AccountDao) context.getBean("accountDao2");
        accountDao2.addAccount();

        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.addAccount();
    }
}
