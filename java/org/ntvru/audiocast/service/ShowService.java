package org.ntvru.audiocast.service;

import java.util.List;

import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.model.Show;
import org.ntvru.audiocast.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {

	@Autowired
	private ShowRepository repository;
	
	@Autowired
	private CounterService counterService;
	
	@Autowired
	private FileService fileService;
	
	
	
	public void save(String path, String name, Long size, String type,String showName, String showTopic,String showSynopsis,String url){
		
		FileDocument fileDocument = new FileDocument(path, name, size, type);
		fileDocument.setId(String.valueOf(counterService.getNextSequence("fileDocument")));	
		 System.out.println("URL: "+url+fileDocument.getId()+"/"+name);
		Show show = new Show(showName,showTopic,showSynopsis,fileDocument,url+fileDocument.getId());
		show.setId(String.valueOf(counterService.getNextSequence("shows")));
		//show.setUrl(url);
		repository.save(show);
		
	}
	
	public void save(String showName, String showTopic,String showSynopsis){}
	
	public List<Show> findAll() {

        return repository.findAll();
    }
	
	  

	    public Show findById(String id) {

	        return repository.findOne(id);
	    }
	
}
