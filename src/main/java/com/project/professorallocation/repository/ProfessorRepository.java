package com.project.professorallocation.repository;


import com.project.professorallocation.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    List<Professor> findByNameContaining(String partName);

    List<Professor> findByDepartmentId(Long departmentId);

}
