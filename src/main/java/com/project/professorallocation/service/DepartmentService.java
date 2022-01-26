package com.project.professorallocation.service;
import com.project.professorallocation.entity.Course;
import com.project.professorallocation.entity.Department;
import com.project.professorallocation.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public Department findById(Long id) {
        Optional<Department> departmentOptional = departmentRepository.findById(id);
        Department department = departmentOptional.orElse(null);
        return department;
    }
}
