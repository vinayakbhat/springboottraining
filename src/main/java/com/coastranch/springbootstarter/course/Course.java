package com.coastranch.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.coastranch.springbootstarter.topic.Topic;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Course {

	
	public Course() {
		super();
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}

	@Getter
	@Setter
	@ManyToOne
	private Topic topic;
	
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
