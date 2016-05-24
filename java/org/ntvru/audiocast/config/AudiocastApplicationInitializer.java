package org.ntvru.audiocast.config;

import org.ntvru.audiocast.controller.HomeController;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AudiocastApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[]{HomeController.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
      return new Class<?>[]{WebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"/","/home"};
	}

}
