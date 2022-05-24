package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StoredFileDTO implements Serializable {

	private static final long serialVersionUID = 7097146275619833709L;
	
	private String originalFileName;
	private String storedFileName;
	private String fileId;
	private Long fileSize;
	private LocalDateTime registDatetime;
	private String url;
	
	@Override
	public String toString() {
		return "StoredFileDTO [originalFileName=" + originalFileName + ", storedFileName=" + storedFileName
				+ ", fileId=" + fileId + ", fileSize=" + fileSize + ", registDatetime=" + registDatetime + ", url="
				+ url + "]";
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getStoredFileName() {
		return storedFileName;
	}
	public void setStoredFileName(String storedFileName) {
		this.storedFileName = storedFileName;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public LocalDateTime getRegistDatetime() {
		return registDatetime;
	}
	public void setRegistDatetime(LocalDateTime registDatetime) {
		this.registDatetime = registDatetime;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
