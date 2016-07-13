package org.ntvru.audiocast.repository;

import org.ntvru.audiocast.model.Counter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends MongoRepository<Counter, String>{

}
