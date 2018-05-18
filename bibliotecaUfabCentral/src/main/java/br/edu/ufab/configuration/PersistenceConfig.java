package br.edu.ufab.configuration;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:hibernate.properties" })

/**
* System database configuration class
* @author  Caio Silva e Jose George
* @version 1.0
* @since   2018-05-13
*/	
public class PersistenceConfig {
 
   @Autowired
   private Environment env;
   
   /** cria uma nova SessionFActory e retorna a mesma
  	 *  @return um objeto de LocalSessionFactoryBean  
  	 */
   @Bean
   public SessionFactory sessionFactory() {
      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
      sessionFactory.setDataSource(restDataSource());
      sessionFactory.setPackagesToScan(
    		  new String[] { "br.edu.ufab..model" });
      sessionFactory.setHibernateProperties(hibernateProperties());
      try {
			sessionFactory.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sessionFactory.getObject();
      
   }
   
   /** Cria uma nova instancia de HibernateTemplate
	 *  @return template especifico do hibernate definido por sessionFactory  
	 */
   public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory());
	}
   
   /** Configura o Data Source
  	 *  @return o dataSource configurado  
  	 */
   @Bean
   public DataSource restDataSource() {
      BasicDataSource dataSource = new BasicDataSource();
      dataSource.setDriverClassName(env.getProperty("database.driver"));
      dataSource.setUrl(env.getProperty("database.url"));
      dataSource.setUsername(env.getProperty("database.root"));
      dataSource.setPassword(env.getProperty("database.root"));
 
      return dataSource;
   }
 
   @Bean
   @Autowired
   public HibernateTransactionManager transactionManager(
     SessionFactory sessionFactory) {
  
      HibernateTransactionManager txManager
       = new HibernateTransactionManager();
      txManager.setSessionFactory(sessionFactory);
 
      return txManager;
   }
 
   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
      return new PersistenceExceptionTranslationPostProcessor();
   }   
   /** Configura as propriedades do hibernate
 	 *  @return as especificacoes para as propriedades
 	 */
   Properties hibernateProperties() {
	   Properties properties = new Properties();
       properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
       properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
       properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
         
       return properties;   
   }
}