package zyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
/**
 * @author GG_B
 * @version 1.0
 */
@SpringBootApplication
@ImportResource("classpath:bean.xml")//导入xml配置文件
public class App 
{
    public static void main( String[] args ) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names){
//            System.out.println(name);
//        }

//        Cat cat = context.getBean(Cat.class);
//        User user = context.getBean(User.class);
//        MyConfig myConfig = context.getBean(MyConfig.class);
//        System.out.println(cat);
//        System.out.println(user);
//        System.out.println(myConfig);
//        System.out.println(myConfig.user() == myConfig.user());


    }
}
