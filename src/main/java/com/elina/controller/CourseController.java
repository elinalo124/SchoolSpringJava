package com.elina.controller;

import com.elina.model.Course;
import com.elina.service.CourseService;
import com.elina.service.CourseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class CourseController {

    private CourseServiceImpl courseServiceImpl;

    @Autowired
    public void setCourseServiceImpl(CourseServiceImpl courseServiceImpl) {
        this.courseServiceImpl = courseServiceImpl;
    }

    @RequestMapping("/")
    public ModelAndView home() {
        List<Course> listCourse = courseServiceImpl.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCourse", listCourse);
        return mav;
    }

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


}
