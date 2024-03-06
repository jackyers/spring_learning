package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author GG_B
 * @version 1.0
 */
@Configuration
@Import(value = {JdbcConfig.class})
@ComponentScan(basePackages = {"zyh"})
public class SpringConfig {

}
