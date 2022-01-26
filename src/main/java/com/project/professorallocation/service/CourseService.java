package com.project.professorallocation.service;

import com.project.professorallocation.repository.CourseRepository;
import org.springframework.stereotype.Service;
@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
