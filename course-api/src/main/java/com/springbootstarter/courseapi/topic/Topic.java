package com.springbootstarter.courseapi.topic;

import java.util.List;

public class Topic {

	
	private String id;
	private String framework;
	private String description;
	
	public Topic(String id, String framework, String description) {
		this.id=id;
		this.framework=framework;
		this.description=description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	
}
