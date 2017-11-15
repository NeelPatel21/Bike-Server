package com.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/*
@SpringBootApplication(scanBasePackages = {"com.bike.annotation","com.bike.data",
		"com.bike.dispatcher","com.bike.service"},
		exclude = {DataSourceAutoConfiguration.class,JndiDataSourceAutoConfiguration.class,
				DataSourceTransactionManagerAutoConfiguration.class,JdbcTemplateAutoConfiguration.class,
				XADataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class,
				DispatcherServletAutoConfiguration.class,RepositoryRestMvcAutoConfiguration.class,
				ServerPropertiesAutoConfiguration.class,SpringDataWebAutoConfiguration.class,
				CassandraDataAutoConfiguration.class, CassandraRepositoriesAutoConfiguration.class,
				ErrorMvcAutoConfiguration.class,MultipartAutoConfiguration.class,
				WebClientAutoConfiguration.class})*/
@Configuration
@EnableAutoConfiguration(exclude = {/*DataSourceAutoConfiguration.class,*/JndiDataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,JdbcTemplateAutoConfiguration.class,
		XADataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class,
		DispatcherServletAutoConfiguration.class,RepositoryRestMvcAutoConfiguration.class,
		ServerPropertiesAutoConfiguration.class,SpringDataWebAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class,MultipartAutoConfiguration.class,
		CassandraDataAutoConfiguration.class, CassandraRepositoriesAutoConfiguration.class,
		WebClientAutoConfiguration.class,HttpEncodingAutoConfiguration.class})
@ComponentScan(basePackages = {"com.bike.annotation","com.bike.data",
		"com.bike.dispatcher","com.bike.service"},
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
