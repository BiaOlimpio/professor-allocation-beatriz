package com.project.professorallocation.service;
import com.project.professorallocation.entity.Allocation;
import com.project.professorallocation.repository.AllocationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AllocationService {

    private AllocationRepository allocationRepository;

    public AllocationService(AllocationRepository allocationRepository) {
        this.allocationRepository = allocationRepository;
    }

    public Allocation findById(Long id) {
        Optional<Allocation> allocationOptional = allocationRepository.findById(id);
        Allocation allocation = allocationOptional.orElse(null);
        return allocation;


    }
}




