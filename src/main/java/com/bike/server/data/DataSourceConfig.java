package com.bike.server.data;

import com.bike.server.annotation.DeployNonHeroku;
import com.bike.server.annotation.DevNonDeploy;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;


@Configuration
class DataSourceConfig {

    @DevNonDeploy
    DataSource devDataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.DERBY)
                .build();
    }

    @ConfigurationProperties(prefix = "spring.datasource")
    @DeployNonHeroku
    DataSource deployDataSource(DataSourceProperties p){
        DataSourceBuilder db= DataSourceBuilder.create(p.getClassLoader());
        db.driverClassName("org.postgresql.Driver");
        db.url("jdbc:postgresql://localhost:5432/bike");
        db.username("postgres");
        db.password("root");
        return db.build();
    }

}
