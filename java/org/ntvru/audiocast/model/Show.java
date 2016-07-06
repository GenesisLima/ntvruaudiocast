package org.ntvru.audiocast.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Show {
	@Id
	private int id;
	private String showNO;
    private String name;
	private String topic;
	private String synopsis;
	private String mediaPath;
	
	
	
	
	public Show() {
		super();
	}
	
	



	public Show(String showNO, String name, String topic, String synopsis,
			String mediaPath) {
		super();
		this.showNO = showNO;
		this.name = name;
		this.topic = topic;
		this.synopsis = synopsis;
		this.mediaPath = mediaPath;
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



	public String getMediaPath() {
		return mediaPath;
	}



	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}





	public String getShowNO() {
		return showNO;
	}





	public void setShowNO(String showNO) {
		this.showNO = showNO;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}
	
	
	
    
}
