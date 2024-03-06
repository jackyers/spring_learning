import Dao.OrderDao;
import Dao.PersonDao;
import Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GG_B
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.addUserDao();

        PersonDao personDao = (PersonDao) context.getBean("personDao");
        personDao.addPerson();

        OrderDao orderDao = (OrderDao) context.getBean("orderFactory");
        orderDao.addOrder();

    }
}
