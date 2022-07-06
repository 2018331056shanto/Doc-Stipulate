package com.stipulate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.stipulate.Entity.User;


@SpringBootApplication
@ComponentScan
public class Stipulate {
	public static void main(String[] args) {
		
		SpringApplication.run(Stipulate.class, args);
//		User user=new User();
//		user.setId(1412);
//		user.setName("Shanto");
//		user.setUserName("Shanto2018331056");
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(User.class);
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(user);
//		tx.commit();
		
	}

}
