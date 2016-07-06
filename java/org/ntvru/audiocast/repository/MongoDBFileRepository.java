package org.ntvru.audiocast.repository;

import java.util.List;

import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.model.Show;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;



public class MongoDBFileRepository  {

	private final Mongo mongo;
	private final String collectionName;
	private final String databaseName;
	
	
	
	public MongoDBFileRepository(Mongo mongo, String collectionName,
			String databaseName) {
		super();
		this.mongo = mongo;
		this.collectionName = collectionName;
		this.databaseName = databaseName;
	}

		
	




	public long count() {
		return getCollection().count();
	}

	public void save(FileDocument file) {
		BasicDBObject query = new BasicDBObject("fileId",file.getFileId());
	DBObject dbFile = transform(file);
	
		DBObject fromDB = getCollection().findAndModify(query, dbFile);
		if(fromDB ==null){
			getCollection().insert(dbFile);
			
		}

	}

	
	public void delete(FileDocument file) {
		// TODO Auto-generated method stub

	}

	
	public List<FileDocument> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public FileDocument findByFileNo(String fileNo) {
		// TODO Auto-generated method stub
		return null;
	}



	
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}
private DBCollection getCollection(){
		
		return mongo.getDB(databaseName).getCollection(collectionName);
	}
	
	private FileDocument transform(DBObject dbFile){
		return new FileDocument((String)dbFile.get("filePath"), (String) dbFile.get("fileName"),(Long)dbFile.get("fileSize"),(String) dbFile.get("fileType"));
			}
	
	private DBObject transform(FileDocument file){
		
		BasicDBObject dbFile = new BasicDBObject("fileId", file.getFileId()).
				append("filePath", file.getFilePath()).append("fileName", file.getFileName()).append("fileSize", file.getFileSize()).append("fileType", file.getFileType());
				return dbFile;
	}



//	@Override
//	public FileDocument findByFileNo(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
