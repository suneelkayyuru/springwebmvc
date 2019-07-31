package info.inetsolv.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MocInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
		container.register(MOCUtil.class);
		
		DispatcherServlet servlet = new DispatcherServlet(container);
		Dynamic dynamic = servletContext.addServlet("servlet", servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(3);

	}

}
