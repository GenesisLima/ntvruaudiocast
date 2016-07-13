package org.ntvru.audiocast.config;

import org.ntvru.audiocast.service.CounterService;
import org.ntvru.audiocast.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

	@Bean
	public FileService fileService(){
		return new FileService();
		
	}
	
	@Bean
	public CounterService counterService(){
		
		return new CounterService();
	}
}
