package fr.dev.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author nicolas.vivion
 *
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableSwagger2
@ComponentScan("fr.dev.tp1")
public class App 
{
	/**
	 * main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}