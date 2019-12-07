package com.coastranch.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring", "spring framework", "SpringFrameworkDescription"),
				new Topic("java", "Core Java", "Core Java 1.8"),
				new Topic("javascript", "Javascript", "Javascript Description"));
	}
}