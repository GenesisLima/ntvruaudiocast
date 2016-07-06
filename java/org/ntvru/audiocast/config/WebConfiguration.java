package org.ntvru.audiocast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"org.ntvru.audiocast.controller","org.ntvru.audiocast.service","org.ntvru.audiocast.repository"})
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/resources/*").addResourceLocations("/resources/");
		registry.addResourceHandler("/assets/*").addResourceLocations("/assets/");
		registry.addResourceHandler("/css/*").addResourceLocations("/css/");
		registry.addResourceHandler("/js/*").addResourceLocations("/js/");	  
		registry.addResourceHandler("/icons/*").addResourceLocations("/icons/");
		registry.addResourceHandler("/images/*").addResourceLocations("/images/");
		registry.addResourceHandler("/MDicons/*").addResourceLocations("/MDicons/");
		
       

		
	}
	
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public ViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver(){
		
		return new CommonsMultipartResolver();
	}
	
	
}
