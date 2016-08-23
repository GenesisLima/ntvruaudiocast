package org.ntvru.audiocast.service;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletContext;

import org.ntvru.audiocast.config.ApplicationContextProvider;
import org.ntvru.audiocast.config.AudiocastApplicationInitializer;
import org.ntvru.audiocast.config.MongoConfiguration;
import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.repository.FileRepository;
import org.ntvru.audiocast.repository.MongoDBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.Mongo;



/**
 *  Created by NTVRU
 */
@Service
public class FileService {

    @Autowired
    private FileRepository repository;
    
    @Autowired Mongo mongo;
    
   @Autowired CounterService counterService;
  
       

    public void save(String path, String name, Long size, String type) {
    	System.out.println("PATH:"+path+name);  
    	FileDocument fileDocument = new FileDocument(path, name, size, type);
    	System.out.println("File Document:"+fileDocument.getFileName());
    	fileDocument.setId(String.valueOf(counterService.getNextSequence("fileDocument")));
    	    	System.out.println("File Document:"+fileDocument.getId());
    	    	repository.save(fileDocument);
    	//new MongoDBFileRepository(mongo,"fileDocument","showdb").save(fileDocument);
    	System.out.println("FIND ALL"+this.findAll().get(this.findAll().size()).getFileName());
    }

    public List<FileDocument> findAll() {

        return repository.findAll();
    }

    public FileDocument findById(String id) {

        return repository.findOne(id);
    }

    public void delete(String id) {

        repository.delete(id);
    }

    public String createPath() {

        LocalDate localDate = LocalDate.now();
        String dd = String.valueOf(localDate.getDayOfMonth());
        String mm = String.valueOf(localDate.getMonthValue());
        String yyyy = String.valueOf(localDate.getYear());

       // return "." + "/" + yyyy + "/" + mm+ "/" +dd;
        return "c:\\uploads\\"+yyyy+"\\"+mm;
        //return absoluteFilePath;
      
    }
}
