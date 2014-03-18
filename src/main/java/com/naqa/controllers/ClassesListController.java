package com.naqa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassesListController {

    @RequestMapping("/classes")
    public ModelAndView listClasses() {
        return new ModelAndView("listClasses");
    }
}