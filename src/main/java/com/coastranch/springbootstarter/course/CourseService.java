package com.coastranch.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id) {
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id)
				.forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return null;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}
}
