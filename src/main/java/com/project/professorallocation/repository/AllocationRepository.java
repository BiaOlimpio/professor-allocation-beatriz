package com.project.professorallocation.repository;

import com.project.professorallocation.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllocationRepository  extends JpaRepository<Allocation, Long> {

      List<Allocation> findByProfessorId(Long professorId);

      List<Allocation> findByCourseId(Long courseId);
}
