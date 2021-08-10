package com.elina.service;

import com.elina.model.Course;
import com.elina.repository.CourseRepository;
import com.elina.repository.CourseRespositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private CourseRepository repository;

    public CourseServiceImpl() {
        System.out.println("Constructing CourseServiceImpl with no args");
    }

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
        System.out.println("Contructing CourseServiceImpl");
    }

    @Autowired
    public void setRepository(CourseRepository repository) {
        this.repository = repository;
        System.out.println("Setting repo for CourseServiceImpl");
    }

    public List<Course> findAll(){
        return repository.findAll();
    }


}
