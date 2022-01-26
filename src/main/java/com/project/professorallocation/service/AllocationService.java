package com.project.professorallocation.service;
import com.project.professorallocation.repository.AllocationRepository;
import org.springframework.stereotype.Service;

@Service
public class AllocationService {

    private AllocationRepository allocationRepository;

    public AllocationService(AllocationRepository allocationRepository) {
        this.allocationRepository = allocationRepository;
    }
}
