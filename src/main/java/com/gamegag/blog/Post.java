package com.gamegag.blog;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize
@Entity
@Table(name="post")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_IMAGE")
	private int Id;
	
	@Column(name = "NAME")
	private String Name;
	
	@Column(name = "DESCRIPTION")
	private String Description;
	
	@Column(name = "SOURCE_FILE")
	private String SourceFile;
	
	@Column(name = "USER_UPLOAD")
	private String UserUpload;
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
	
	public String getSourceFile() {
		return SourceFile;
	}

	public void setSourceFile(String UserUpload) {
		this.UserUpload = UserUpload;
	}
	
	public String getUserUpload() {
		return UserUpload;
	}

	public void setUserUpload(String UserUpload) {
		this.UserUpload = UserUpload;
	}
}
