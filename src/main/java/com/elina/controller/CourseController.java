package com.elina.controller;

import com.elina.model.Course;
import com.elina.service.CourseService;
import com.elina.service.CourseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
public class CourseController {

    private CourseServiceImpl courseServiceImpl;

    @Autowired
    public void setCourseServiceImpl(CourseServiceImpl courseServiceImpl) {
        this.courseServiceImpl = courseServiceImpl;
    }

    @GetMapping("/course")
    public Course getCourse(@RequestParam(value = "id") Long id){
        Course course = courseServiceImpl.findById(id);
        System.out.println("get Course\n"+ course);
        return course;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        List<Course> courses = courseServiceImpl.findAll();
        System.out.println("All courses\n"+courses);
        return courses;
    }


    @PostMapping("/course")
    public void saveCourse(@RequestBody Course newCourse){
        System.out.println("Controller is saving:\n"+newCourse);
        courseServiceImpl.save(newCourse);
    }

    /*
    @RequestMapping("/")
    public ModelAndView home() {
        List<Course> listCourse = courseServiceImpl.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCourse", listCourse);
        return mav;
    }

    //CREATE
    @RequestMapping("/new")
    public String newCourseForm(Map<String, Object> model) {
        Course course = new Course();
        model.put("course", course);
        return "new_course";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCourse(@ModelAttribute("course") Course course) {
        courseServiceImpl.save(course);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public ModelAndView editCourseForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("edit_course");
        Course course = courseServiceImpl.findById(id);
        mav.addObject("course", course);

        return mav;
    }

    @RequestMapping("/delete")
    public String deleteCourseForm(@RequestParam long id) {
        courseServiceImpl.deleteById(id);
        return "redirect:/";
    }
     */



}
