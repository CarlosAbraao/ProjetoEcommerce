package com.carlosdev.lojavirtual.CONFIG_DB_MYSQL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class ConfigBancoMysql {




        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/lojaecommerce?useTimezone=true&serverTimezone=America/Sao_Paulo");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            return dataSource;
        }

        @Bean
        public JpaVendorAdapter jpaVendorAdapter() {
            HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
            adapter.setDatabase(Database.MYSQL);
            adapter.setShowSql(true);
            adapter.setGenerateDdl(true);
            adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
            adapter.setPrepareConnection(true);
            return adapter;
        }
}
