package com.in28minutes.learn_spring_boot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;

@RestController
public class CourseController {


	@Autowired
	private CourseRepository repository;

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();
//		return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
//				new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourseDetails(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		return course;
	}

	// POST - Create a new resource (/courses)
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	// PUT - Update/replace a resource (/course/1)
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	// DELETE - Delete a resource (/course/1)
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id, @RequestBody Course course) {
		repository.deleteById(id);
	}

}
