package org.ntvru.audiocast.config;

import org.ntvru.audiocast.controller.HomeController;
import org.ntvru.audiocast.repository.FileRepository;
import org.ntvru.audiocast.repository.MongoDBFileRepository;
import org.ntvru.audiocast.service.FileService;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AudiocastApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[]{HomeController.class,ServiceConfiguration.class,MongoConfiguration.class,FileRepository.class};
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
