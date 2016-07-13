package org.ntvru.audiocast.config;

import java.net.UnknownHostException;

import org.ntvru.audiocast.repository.CounterRepository;
import org.ntvru.audiocast.repository.FileRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackageClasses={FileRepository.class,CounterRepository.class})
public class MongoConfiguration {

	public static final String DB_NAME = "showdb";
	
	@Bean
	public Mongo mongo() throws UnknownHostException{
		return new MongoClient();		
	}
//	@Bean
//	public ShowRepository showRepository(Mongo mongo){
//		
//		return new MongoDBShowRepository(mongo, DB_NAME, "shows");
//	}
	
	
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
	return new MongoTemplate(mongoFactoryBean().getObject(), DB_NAME);
	}
	
	@Bean
	public MongoFactoryBean mongoFactoryBean() {
	return new MongoFactoryBean();
	}
	
	@Bean
	public MongoOperations mongoOperations() throws Exception{
		MongoOperations mongo = (MongoOperations) this.mongoTemplate();
		return mongo;
	}

}
