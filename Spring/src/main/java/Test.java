import Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GG_B
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        AccountService accountservice = (AccountService) context.getBean("accountService");
        accountservice.addAcccount();

    }
}
