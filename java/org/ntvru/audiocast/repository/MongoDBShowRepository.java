package org.ntvru.audiocast.repository;

import java.util.ArrayList;
import java.util.List;

import org.ntvru.audiocast.model.Show;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import javax.annotation.*;

public class MongoDBShowRepository implements ShowRepository{

	private final Mongo mongo;
	private final String collectionName;
	private final String databaseName;
	
	
	
	
	public MongoDBShowRepository(Mongo mongo, String collectionName,
			String databaseName) {
		super();
		this.mongo = mongo;
		this.collectionName = collectionName;
		this.databaseName = databaseName;
	}

	public long count() {
		
		return getCollection().count();
	}

	public void save(Show show) {
		BasicDBObject query = new BasicDBObject("showNO", show.getShowNO());
		DBObject dbShow = transform(show);
		
		DBObject fromDB = getCollection().findAndModify(query, dbShow);
		if(fromDB ==null){
			getCollection().insert(dbShow);
			
		}
			
	}
	
    public void delete(Show show) {
	BasicDBObject query = new BasicDBObject("showNO", show.getShowNO());
	getCollection().remove(query);
		
	}

	public List<Show> findAll() {
		DBCursor cursor = getCollection().find(null);
		List<Show> shows = new ArrayList<Show>(cursor.size());
		for(DBObject dbObject : cursor){
			shows.add(transform(dbObject));			
		}
		return shows;
	}

	public Show findByShowNo(String showNo) {
		BasicDBObject query = new BasicDBObject("showNO", showNo);
		DBObject dbShow = getCollection().findOne(query);
		return transform(dbShow);
	}

	
	private DBCollection getCollection(){
		
		return mongo.getDB(databaseName).getCollection(collectionName);
	}
	
	private Show transform(DBObject dbShow){
		return new Show((String) dbShow.get("showNO"),(String)dbShow.get("name"), (String) dbShow.get("topic"),(String)dbShow.get("synopsis"),(String) dbShow.get("mediaPath"));
			}
	
	private DBObject transform(Show show){
		
		BasicDBObject dbShow = new BasicDBObject("showNO", show.getShowNO()).
				append("name", show.getName()).append("topic", show.getTopic()).append("synopsis", show.getSynopsis()).append("mediaPath", show.getMediaPath());
				return dbShow;
	}
	
//	@PostConstruct
//	public void shutdown(){
//		mongo.getDB(databaseName).dropDatabase();
//		
//	}
	
	@PreDestroy
	public void cleanUp() {
	mongo.getDB(databaseName).dropDatabase();
	}

	@Override
	public Show findByShowNo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
