package com.elina.repository;

import com.elina.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("courseRepository")
public class CourseRespositoryImpl implements CourseRepository{

    @Override
    public List<Course> findAll(){
        List<Course> courses = new ArrayList<Course>();

        Course course = new Course();
        course.setId(1);
        course.setName("Course1");
        course.setDescription("Maths");
        courses.add(course);

        return courses;
    }
}
