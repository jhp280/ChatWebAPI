package chat.webapi.demo.model;

import java.util.UUID;

public class FileInfo {
	private UUID fileID;
	private String fileName;
	private String filePath;
	
	public FileInfo(UUID fileID,String fileName,String filePath) {
		// TODO Auto-generated constructor stub
		this.fileID=fileID;
		this.fileName=fileName;
		this.filePath=filePath;
	}

	public UUID getFileID() {
		return this.fileID;
	}

	public void setFileID(UUID fileID) {
		this.fileID = fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
