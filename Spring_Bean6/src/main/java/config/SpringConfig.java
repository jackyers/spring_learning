package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author GG_B
 * @version 1.0
 */
@Configuration
@ComponentScan("zyh")
public class SpringConfig {
    @Bean(name = "runner")
    public QueryRunner queryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }
    @Bean
    public DataSource dataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/rg56");
            dataSource.setUser("root");
            dataSource.setPassword("592678030111");
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }
}
