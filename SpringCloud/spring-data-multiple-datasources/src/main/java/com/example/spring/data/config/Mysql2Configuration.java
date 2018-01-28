package com.example.spring.data.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableJpaRepositories(entityManagerFactoryRef = "mysql2EntityManager",
    transactionManagerRef = "mysql2TransactionManager",
    basePackages = "com.example.spring.data.repositories")
public class Mysql2Configuration {

    @Bean
    @ConfigurationProperties(prefix = "spring.mysql2.datasource")
    public DataSource mysql2DataSource() {
        return DataSourceBuilder
            .create()
            .build();
    }

    @Bean(name = "mysql2EntityManager")
    public LocalContainerEntityManagerFactoryBean mysql2EntityManagerFactory(
        EntityManagerFactoryBuilder builder) {
        return builder
            .dataSource(mysql2DataSource())
            .packages(
                "com.example.spring.data.models") // you can also give the package where the Entities are given rather than giving Entity class
            .persistenceUnit("mysql2PU")
            .build();
    }

    @Bean(name = "mysql2TransactionManager")
    public PlatformTransactionManager mysql2TransactionManager(
        @Qualifier("mysql2EntityManager") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
