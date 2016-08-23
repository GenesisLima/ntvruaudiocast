package org.ntvru.audiocast.model;


import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by NTVRU
 */
@Document(collection="fileDocuments")
public class FileDocument implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1259176997906412295L;


	@Id
	private String id;

  
    private String filePath;

   
    private String fileName;

    private Long fileSize;

    private String fileType;

    public FileDocument() {
        super();
    }
    
    @PersistenceConstructor
    public FileDocument(String filePath, String fileName, Long fileSize, String fileType) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
    }

 

 
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


	
	@Override
	public String toString() {
		return "FileDocument [id=" + id + ", filePath=" + filePath
				+ ", fileName=" + fileName + ", fileSize=" + fileSize
				+ ", fileType=" + fileType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileDocument other = (FileDocument) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	

    
    


	
}




    
    

