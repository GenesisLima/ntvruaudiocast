package org.ntvru.audiocast.service;

import org.ntvru.audiocast.model.Counter;
import org.ntvru.audiocast.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

	@Autowired
	private MongoOperations mongoOperations;
	
	
	
	public int getNextSequence(String collection){
		    
		Counter counter = mongoOperations.findAndModify(new Query(Criteria.where("_id").is(collection)), new Update().inc("seq", 1), new FindAndModifyOptions().returnNew(true), Counter.class);	
		
		
		return counter.getSeq();		
	}
	
}
