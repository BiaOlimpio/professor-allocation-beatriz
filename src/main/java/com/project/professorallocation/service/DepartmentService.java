package com.project.professorallocation.service;
import com.project.professorallocation.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}
