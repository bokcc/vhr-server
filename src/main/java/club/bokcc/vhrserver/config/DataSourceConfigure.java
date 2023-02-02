package club.bokcc.vhrserver.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@Configuration
public class DataSourceConfigure {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .type(DruidDataSource.class)
                .url("jdbc:mysql:///vhr")
                .username("bokcc")
                .password("using#001")
                .build();
    }
}
