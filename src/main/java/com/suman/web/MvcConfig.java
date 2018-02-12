package com.suman.web;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan("com.suman.web")
@EnableWebMvc
@EnableTransactionManagement
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	   @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
	   @Bean
	   public DataSource getDataSource() 
	   {
		   BasicDataSource dataSource=new BasicDataSource();
		   dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		   dataSource.setUrl("jdbc:mysql://localhost:3306/datajava");
		   dataSource.setUsername("root");
		   dataSource.setPassword("root");
		   return dataSource;
	   }
	   
	   @Bean
	   public SessionFactory getSessionFactory(DataSource dataSource) {
		   
		 
		   LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		   
		   Properties properties=new Properties();
		   properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		   properties.put("hibernate.hbm2ddl.auto", "update");
		   properties.put("hibernate.show_sql", "true");

		   
		   sessionBuilder.addProperties(properties);
		   sessionBuilder.addAnnotatedClass(Alien.class);
		   return sessionBuilder.buildSessionFactory();
		
	}
	   
	  @Bean
	public HibernateTransactionManager getTransaction(SessionFactory sessionFactory) {
		
		HibernateTransactionManager manager=new HibernateTransactionManager(sessionFactory);
		return manager;
		   
	   }

}
