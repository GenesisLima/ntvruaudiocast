package org.ntvru.audiocast.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {

	ApplicationContext context;
	
	
	
	public ApplicationContext getContext() {
		return context;
	}



	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
	context = ac;

	}

}
