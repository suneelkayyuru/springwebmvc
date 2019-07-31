package info.inetsolv.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
public class InternalResourceViewResolverUtil {
	@Bean
	public InternalResourceViewResolver resourceViewResolver() {
		
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/jsps/");
		resourceViewResolver.setSuffix(".jsp");
		
		return resourceViewResolver;
		
		
	}

}
