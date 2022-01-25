package com.project.professorallocation.repository;

import com.project.professorallocation.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository  extends JpaRepository<Allocation, Long> {

}
