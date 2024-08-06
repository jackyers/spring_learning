package zyh.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zyh.pojo.Car;
import zyh.pojo.Cat;
import zyh.pojo.User;

/**
 * @author GG_B
 * @version 1.0
 */
@Configuration(proxyBeanMethods = true)  //表示当前类是一个配置类,当前默认为单例bean
//@Import(value = {Animal.class, StudentConfig.class}) //导入普通类时，默认的ID是类的全限定名
//@Import(value = {MyImportSelector.class})//导入配置类
//@ConditionalOnBean(name = "cat")//只有ioc容器中存在名为cat的Bean时，才会将这个类下面所有有@Bean注解的Bean注入容器中
@EnableConfigurationProperties(Car.class)//或者这个不写，不在配置类这里写对Car这个Bean的管理，在Car类那里写@Component注解完成Bean的注入
public class MyConfig {

    @Bean   //默认情况下，Bean的ID是方法的名称，返回值就是Bean的类型
    public User user(){
        User user = new User();
        user.setUsername("jack");
        user.setAge(18);
        return user;
    }

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("咪咪");
        cat.setColor("black");
        return cat;
    }


}
