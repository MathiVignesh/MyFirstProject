package com.niit.DBConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.Model.Product;
@Configuration
@EnableTransactionManagement
public class DBConfig
{
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{

		System.out.println("Entering the dataSource");
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/BikeWale");
		dataSource.setUsername("sa");
		System.out.println(dataSource);
		return dataSource;
	}
@SuppressWarnings("deprecation")
@Bean
public SessionFactory sessionFactory()
{
	System.out.println("Entering sessionFactory creation method");
	LocalSessionFactoryBuilder lsf=new LocalSessionFactoryBuilder(getDataSource());
	Properties hibernateProperties=new Properties();
	hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
	hibernateProperties.setProperty("hibernate.show_sql","true");
	lsf.addProperties(hibernateProperties);
	Class classess[]=new Class[] {Product.class};
	System.out.println("SessionFactory bean"+lsf);
	return lsf.addAnnotatedClasses(classess).buildSessionFactory();

}
@Bean
public HibernateTransactionManager hibtransManagement()
{
	return new HibernateTransactionManager(sessionFactory());
	
}
}
