package com.example.backend.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
// @PropertySource("classpath:/application.properties")
@MapperScan(value="com.example.backend.mapper")
public class DBConfig {
    private final ApplicationContext applicationContext;

    @Autowired
    DBConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    
    
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() throws Exception {
        hikariConfig().setDriverClassName("org.postgresql.Driver");
        hikariConfig().setJdbcUrl("jdbc:postgresql://fms-database-dev.cjsmyenwres8.ap-northeast-2.rds.amazonaws.com:5432/kms_db");
        hikariConfig().setUsername("kms_user");
        System.out.println("hikari config start");
        System.out.println(hikariConfig().getJdbcUrl());
        System.out.println("hikari config end");
        hikariConfig().setPassword("drimaes1!");
        DataSource dataSource = new HikariDataSource(hikariConfig());
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.backend.vo");
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
