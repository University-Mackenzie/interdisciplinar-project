package br.mackenzie.interdisciplinarproject.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer implements WebApplicationInitializer{
	
	private AnnotationConfigWebApplicationContext getContext(){
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("br.mackenzie.interdisciplinarproject.config");
		return context;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
	}

}
