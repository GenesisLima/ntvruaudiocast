package org.ntvru.audiocast.main;

import java.net.UnknownHostException;
import java.util.List;

import org.bson.types.ObjectId;
import org.ntvru.audiocast.config.MongoConfiguration;
import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.repository.CounterRepository;
import org.ntvru.audiocast.repository.FileRepository;
import org.ntvru.audiocast.repository.MongoDBShowRepository;
import org.ntvru.audiocast.repository.ShowRepository;
import org.ntvru.audiocast.service.CounterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mongodb.MongoClient;

public class MongoMain {

	public static final String DB_NAME = "showdb";
	
	public static void main(String[] args) throws UnknownHostException {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
		FileRepository repository = ctx.getBean(FileRepository.class);
		CounterRepository cRepository = ctx.getBean(CounterRepository.class);
		CounterService service = ctx.getBean(CounterService.class);
		FileDocument fd = new FileDocument();
		fd.setId(String.valueOf(service.getNextSequence("fileDocument")));
		fd.setFileName("gest2");
		fd.setFilePath("C:\\uploads\\2016\\7analogy.png");
		fd.setFileType("image/JPG");
				//new FileDocument("C:\\uploads\\2016\\7analogy.png", "test", new Long(11), "JPG");
		
		System.out.println("Numbers of Shows: "+repository.count());
		
//		repository.save(new Show("TEM0001", "Opinião Pernambuco", "TOPIC 1", "Synopsis 1","C:\\"));
//		repository.save(new Show("TEM0002", "Opinião Pernambuco", "TOPIC 2", "Synopsis 2","C:\\"));
		
		repository.save(fd);
		//System.out.println("Numbers of Shows: "+repository.count());
		//System.out.println("Name "+repository.findAll().get(1).getFileName());
		//System.out.println("Name "+repository.findAll().get(1).getFilePath());
		for(FileDocument document: repository.findAll()){
			System.out.println("Name "+document.getFileName());
			System.out.println("Name "+document.getFilePath());
			
		}
		//FileDocument s = repository.findAll().get(0);
		
	//	System.out.println("Show: "+s.getFileName());
		
		List<FileDocument> showList = repository.findAll();
		
		System.out.println("Number of Shows returned: " + showList.size());
		
		System.out.println("Number of Shows: " + repository.count());
		
		((AbstractApplicationContext) ctx).close();
		
	}
	
}
