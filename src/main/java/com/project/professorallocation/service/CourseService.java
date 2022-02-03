package com.project.professorallocation.service;


import com.project.professorallocation.entity.Course;
import com.project.professorallocation.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course findById(Long id) {
        if (id != null) {
            Optional<Course> professorOptional = courseRepository.findById(id);
            Course course = professorOptional.orElse(null);
            return course;
        } else {
            return null;
        }
    }

    public List<Course> findAll() {
        List<Course> courses= courseRepository.findAll();
        return courses;
    }

    public Course create(Course course) {
        course.setId(null);
        Course courseNew = courseRepository.save(course);
        return courseNew;
    }

    public Course update(Course course) {
        Long id = course.getId();

        if (id != null && courseRepository.existsById(id)) {
            Course courseNew = courseRepository.save(course);
            return courseNew;
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        if (id != null && courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
        }
    }

    public void deleteAll() {
        courseRepository.deleteAll();
    }
}




