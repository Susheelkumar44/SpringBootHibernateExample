package org.arpit.java2blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"org.arpit.java2blog","org.arpit.java2blog.dao"})
public class SpringBootHibernateApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHibernateApplication.class, args);   
	}
}