package io.mahdi.tutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutorial {
	@Id
	private String id;
	private String title;
	private String description;
	private boolean ispublished ;
}
