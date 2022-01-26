package com.project.professorallocation.Repository;

import com.project.professorallocation.entity.Course;
import com.project.professorallocation.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import java.util.List;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath: application.properties")
public class CourseRepositoryTest {

    @Autowired
    public CourseRepository CourseRepository;

    @Test
    public void findAll()

    {
        List<Course> courses = CourseRepository.findAll();
        System.out.println(courses);

    }
}
