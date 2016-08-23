package org.ntvru.audiocast.model;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="shows")
public class Show {
	
	
	
	@Id
	private String id;
	
    private String name;
	private String topic;
	private String synopsis;
	private String url;
	
	private FileDocument fileDocument;
	
	
	
	public Show() {
		super();
	}
	
	


    @PersistenceConstructor
	public Show(String name, String topic, String synopsis
			,FileDocument fileDocument,String url) {
		super();
		this.name = name;
		this.topic = topic;
		this.synopsis = synopsis;		
		this.fileDocument = fileDocument;
		this.url = url;
	}




    @Transient 
    //@JsonProperty("isDownloaded")
    public Boolean isDownloaded() {
        return StringUtils.isNotEmpty(this.fileDocument.getFileName());
    }






	public FileDocument getFileDocument() {
		return fileDocument;
	}





	public void setFileDocument(FileDocument fileDocument) {
		this.fileDocument = fileDocument;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}






	
	
    
}
