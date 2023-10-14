package helper;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({ "controller", "service", "dao" })
public class MyConfiguration {
	@Bean
	ViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public EntityManager manager()
	{
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
