package com.doutown.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages = {"com.doutown.member.dao"}, sqlSessionFactoryRef ="sqlSessionFactory")
public class MybatisConfig {

    //생성자 주입
    private final ApplicationContext applicationContext;
    public MybatisConfig (ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    SqlSessionFactory sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactory factory = null;
        try {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dataSource);
            factoryBean.setTypeAliasesPackage("com.doutown");
            factoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mapper/**/*.xml"));
            factory = factoryBean.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return factory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
