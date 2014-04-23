package com.naqa.controllers;

import com.naqa.domain.Course;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CoursesControllerTest {

    private CoursesController coursesController;


    @Before
    public void setUp() throws Exception {
        coursesController = new CoursesController();
    }

    @Test
    public void shouldAddCoursesToCourseList() {

        ModelAndView modelAndView = coursesController.listCourses();

        List<String> courseList = (List<String>) modelAndView.getModel().get("courseList");

        assertThat(courseList.get(0), is("Java 101"));
        assertThat(courseList.get(1), is("Ruby 101"));
    }


    @Test
    public void shouldTestTheCurrentFunctionality() {
        Course selectedCourse = new Course();
        ModelAndView modelAndView = coursesController.processPerson(selectedCourse);

        Course course = (Course) modelAndView.getModel().get("course");

        assertThat(course, is(selectedCourse));
    }
}
