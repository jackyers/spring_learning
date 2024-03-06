import Pojo.User;
import Pojo.plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GG_B
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());

        plane plane = (Pojo.plane) context.getBean("plane");
        System.out.println(plane.toString());
    }
}
