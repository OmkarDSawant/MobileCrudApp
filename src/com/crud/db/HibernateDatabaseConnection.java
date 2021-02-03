package com.crud.db;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.crud.dao.Addm;
import com.crud.dao.Mobile;
import com.crud.dao.Register;
import com.crud.dao.Sold;

public class HibernateDatabaseConnection {
	private static StandardServiceRegistry registry;
	  private static SessionFactory sessionFactory;

	  public static SessionFactory getSessionFactory() {
	    if (sessionFactory == null) {
	      try {
	        StandardServiceRegistryBuilder registryBuilder = 
	            new StandardServiceRegistryBuilder();

	        Map settings = new HashMap<>();
	        settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
	        settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/mobile");
	        settings.put("hibernate.connection.username", "root");
	        settings.put("hibernate.connection.password", "");
	        settings.put("hibernate.show_sql", "true");
	        settings.put("hibernate.hbm2ddl.auto", "update");

	        registryBuilder.applySettings(settings);

	        registry = registryBuilder.build();

	        MetadataSources sources = new MetadataSources(registry)
	            .addAnnotatedClass(Mobile.class).addAnnotatedClass(Register.class).addAnnotatedClass(Sold.class).addAnnotatedClass(Addm.class);//POJO class which you have to import as it is in different package
	        	//.addAnnotatedClass(other.class); If you have more tables you can add like this
	        Metadata metadata = sources.getMetadataBuilder().build();

	        sessionFactory = metadata.getSessionFactoryBuilder().build();
	      } catch (Exception e) {
	        System.out.println("SessionFactory creation failed");
	        if (registry != null) {
	          StandardServiceRegistryBuilder.destroy(registry);
	        }
	      }
	    }
	    return sessionFactory;
	  }

	  public static void shutdown() {
	    if (registry != null) {
	      StandardServiceRegistryBuilder.destroy(registry);
	    }
	  }
}

