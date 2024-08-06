import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zyh.service.UserService;

/**
 * @author GG_B
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUser {
    @Autowired
    UserService userService;
    @Test
    public void test01(){
        userService.findAll();
    }
    @Test
    public void test02(){
        userService.deleteUser();
    }
    @Test
    public void test03(){
        userService.addUser();
    }
    @Test
    public void test04(){
        userService.updateUser();
    }
}
