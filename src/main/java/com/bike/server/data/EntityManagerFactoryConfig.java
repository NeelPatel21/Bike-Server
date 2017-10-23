package com.bike.server.data;

import com.bike.server.annotation.Dev;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.Properties;

import javax.sql.DataSource;

@Configuration
public class EntityManagerFactoryConfig {

    @Dev
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds,
                                                                       JpaVendorAdapter ad) {
        LocalContainerEntityManagerFactoryBean sfb = new LocalContainerEntityManagerFactoryBean();
        sfb.setDataSource(ds);
        sfb.setJpaVendorAdapter(ad);
        sfb.setPackagesToScan("com.bike.server.data.bean");
        Properties props = new Properties();
        props.setProperty("hibernate.hbm2ddl.auto", "update");
        props.setProperty("connection.pool_size", "10");
        sfb.setJpaProperties(props);
        sfb.setPersistenceUnitName("data_bike");
        return sfb;
    }

}
