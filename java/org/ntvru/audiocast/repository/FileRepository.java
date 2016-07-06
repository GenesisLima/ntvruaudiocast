package org.ntvru.audiocast.repository;

import java.util.List;

import org.ntvru.audiocast.model.FileDocument;
import org.ntvru.audiocast.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FileRepository extends MongoRepository<FileDocument, String> {
	public long count();
	//public void save(FileDocument file);
	//public void delete(FileDocument file);
	//public List<FileDocument> findAll();
	//public FileDocument findByFileNo(String fileNo);
	//public FileDocument findByFileNo(Long id);
	//public void delete(Long id);
}
