package com.doutown.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost/doytown")
    private String url;
    @Value("root")
    private String user;
    @Value("1234")
    private String password;

    @Bean
    DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(user);
        hikariConfig.setPassword(password);

        hikariConfig.setAutoCommit(true);
        hikariConfig.setConnectionTimeout(30000);
        hikariConfig.setMaximumPoolSize(10);
        return new HikariDataSource(hikariConfig);
    }
}
