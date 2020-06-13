package com.virtusa.customerapidemo.configurations;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Configuration
@Data
@Slf4j
public class DbConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(DbConfiguration.class);
	@Value("${db_url}")
	private String url;
	@Value("${db_driver}")
	private String driverClassName;
	@Value("${db_username}")
	private String userName;
	@Value("${db_password}")
	private String passWord;
	@Profile("production")
	@Bean
	public DataSource prodDataSource() {
		DataSourceBuilder builder= DataSourceBuilder.create();
		builder.url(url);
		builder.username(userName);
		builder.password(passWord);
		builder.driverClassName(driverClassName);
		System.out.println("prod.......");
		return builder.build();
	}
	@Profile("development")
	@Bean
	public DataSource devDataSource() {
		DataSourceBuilder builder= DataSourceBuilder.create();
		builder.url(url);
		builder.username(userName);
		builder.password(passWord);
		builder.driverClassName(driverClassName);
		logger.info("Development");
		logger.debug("development profile....");
		return builder.build();
	}
	@Profile("qa")
	@Bean
	public DataSource qaDataSource() {
		DataSourceBuilder builder= DataSourceBuilder.create();
		builder.url(url);
		builder.username(userName);
		builder.password(passWord);
		builder.driverClassName(driverClassName);
		System.out.println("qa.......");
		return builder.build();
	}
}
