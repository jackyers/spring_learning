package Service;

import Dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GG_B
 * @version 1.0
 */
public class AccountServiceImpl implements AccountService{
    public void addAcccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        AccountDao accountDao = (AccountDao) context.getBean("accountDao");
        accountDao.addAccount();
    }
}
