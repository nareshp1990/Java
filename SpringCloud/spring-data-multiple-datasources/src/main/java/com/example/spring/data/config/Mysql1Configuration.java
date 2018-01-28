package com.example.spring.data.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 30/12/17 1:21 PM
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "mysql1EntityManager",
    transactionManagerRef = "mysql1TransactionManager",
    basePackages = "com.example.spring.data.repositories")
public class Mysql1Configuration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.mysql1.datasource")
    public DataSource mysql1DataSource() {
        return DataSourceBuilder
            .create()
            .build();
    }

    @Primary
    @Bean(name = "mysql1EntityManager")
    public LocalContainerEntityManagerFactoryBean mysql1EntityManagerFactory(
        EntityManagerFactoryBuilder builder) {
        return builder
            .dataSource(mysql1DataSource())
            .packages(
                "com.example.spring.data.models") // you can also give the package where the Entities are given rather than giving Entity class
            .persistenceUnit("mysql1PU")
            .build();
    }

    @Primary
    @Bean(name = "mysql1TransactionManager")
    public PlatformTransactionManager mysql1TransactionManager(
        @Qualifier("mysql1EntityManager") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
