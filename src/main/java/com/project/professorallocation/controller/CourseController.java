package com.project.professorallocation.controller;


import com.project.professorallocation.service.CourseService;
import org.springframework.web.bind.annotation.RestController;



    @RestController
public class CourseController {

        private final CourseService courseService;

        public CourseController(CourseService courseService) {
            super();
            this.courseService = courseService;
        }
    }

