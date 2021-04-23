package com.example.myfirstwebservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
/**
 *This is the Data Source Config.
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the Hikari Data Source Config for the project: myfirstwebservice. </p>
 **/
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("spring.datasource")
public class DataSourceConfig extends HikariConfig {
	
	@Bean
	@Primary
	public HikariDataSource dataSource() {
		HikariDataSource ds = new HikariDataSource(this);
		return ds;
	}
	
}