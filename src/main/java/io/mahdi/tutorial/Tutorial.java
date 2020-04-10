package io.mahdi.tutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutorial {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIspublished() {
		return ispublished;
	}
	public void setIspublished(boolean ispublished) {
		this.ispublished = ispublished;
	}
	
	public Tutorial( ) {
		 
	}
	
	public Tutorial(String id, String title, String description, boolean ispublished) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.ispublished = ispublished;
	}
	@Id
	private String id;
	private String title;
	private String description;
	private boolean ispublished ;
}
