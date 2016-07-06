package org.ntvru.audiocast.service;

import java.time.LocalDate;
import java.util.List;

import org.ntvru.audiocast.config.MongoConfiguration;
import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.repository.FileRepository;
import org.ntvru.audiocast.repository.MongoDBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
    
   

    public void save(String path, String name, Long size, String type) {
    	System.out.println("PATH:"+path+name);    	
    	new MongoDBFileRepository(mongo,"fileDocument","showdb").save(new FileDocument(path, name, size, type));
    	System.out.println("FIND ALL"+this.findAll());
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
        
        String mm = String.valueOf(localDate.getMonthValue());
        String yyyy = String.valueOf(localDate.getYear());

        return "C:\\uploads" + "\\" + yyyy + "\\" + mm;
    }
}
