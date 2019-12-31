package com.coastranch.springbootstarter.topic;



import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Topic {

	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Getter
	@Setter
	@Id
	private String id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String description;
}
