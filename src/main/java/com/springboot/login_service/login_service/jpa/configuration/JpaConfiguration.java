package com.springboot.login_service.login_service.jpa.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:jpa_application.properties")
public class JpaConfiguration {

	@Value("${app.datasource.driverClassName}")
	String driverClassName;
	@Value("${app.datasource.url}")
	String url;
	@Value("${app.datasource.username}")
	String username;
	@Value("${app.datasource.password}")
	String password;
//comment out for mysqlconfig 
	/*@Bean
	public DataSource getDataSource() {

		DataSource dataSource = DataSourceBuilder.create().username(username).password(password)
				.driverClassName(driverClassName).build();

		DriverManagerDataSource dataSourcep = new DriverManagerDataSource();
		dataSourcep.setDriverClassName(driverClassName);
		dataSourcep.setUrl(url);
		dataSourcep.setUsername(username);
		dataSourcep.setPassword(password);
		return dataSourcep;
	}

	@Bean
	public Properties hibernateProperties() {
		final Properties properties = new Properties();

		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.put("hibernate.hbm2ddl.auto", "create-drop");

		return properties;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource, Properties hibernateProperties) {
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource);
		em.setPackagesToScan("com.springboot.login_service.login_service.jpa.entity");
		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		em.setJpaProperties(hibernateProperties);
		em.setPersistenceUnitName("mytestdomain");
		em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		em.afterPropertiesSet();

		return em.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(getDataSource());
	}*/
}
