package com.naqa.controllers;

import com.naqa.domain.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class CoursesController {

    @RequestMapping("/courses")
    public ModelAndView listCourses() {
        ModelAndView modelAndView = new ModelAndView("listCourses");

        List<String> courseList = new ArrayList<String>();
        courseList.add("Java 101");
        courseList.add("Ruby 101");

        modelAndView.addObject("courseList", courseList);
        modelAndView.addObject("course", new Course());

        return modelAndView;
    }
}