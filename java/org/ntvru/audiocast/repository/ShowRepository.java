package org.ntvru.audiocast.repository;

import org.ntvru.audiocast.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowRepository extends MongoRepository<Show, String>{
         
	public long count();

	
	
}
