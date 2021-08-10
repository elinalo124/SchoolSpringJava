package com.elina.service;

import com.elina.model.Course;
import com.elina.repository.CourseRepository;
import com.elina.repository.CourseRespositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("courseService")
public class CourseServiceImpl {

    private CourseRepository repository;

    public CourseServiceImpl() {
        System.out.println("Constructing CourseServiceImpl with no args");
    }

    @Autowired
    public void setRepository(CourseRepository repository) {
        this.repository = repository;
        System.out.println("Setting repo for CourseServiceImpl");
    }

    public void test() {
        // Save a new course
        Course newCourse = new Course();
        newCourse.setName("Course1");
        newCourse.setDescription("Maths");

        repository.save(newCourse);

        // Find a course by ID
        Optional<Course> result = repository.findById(1L);
        result.ifPresent(course -> System.out.println(course));

        // Find courses by last name
        List<Course> courses = repository.findByName("Course1");
        courses.forEach(course -> System.out.println(course));

        // List all courses
        Iterable<Course> iterator = repository.findAll();
        iterator.forEach(course -> System.out.println(course));

        // Count number of course
        long count = repository.count();
        System.out.println("Number of courses: " + count);
    }


}
