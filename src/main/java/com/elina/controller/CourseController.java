package com.elina.controller;

import com.elina.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseServiceImpl courseServiceImpl;

    /*
    //CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Course resource) {
        Preconditions.checkNotNull(resource);
        return courseServiceImpl.create(resource);
    }

    //RETRIEVE
    @GetMapping
    public List<Course> findAll() {
        return courseServiceImpl.findAll();
    }
    @GetMapping(value = "/{id}")
    public Course findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkFound(courseServiceImpl.findById(id));
    }

    //UPDATE
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Course resource) {
        Preconditions.checkNotNull(resource);
        RestPreconditions.checkNotNull(courseServiceImpl.getById(resource.getId()));
        courseServiceImpl.update(resource);
    }
    //DELETE
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        courseServiceImpl.deleteById(id);
    }

     */


}
