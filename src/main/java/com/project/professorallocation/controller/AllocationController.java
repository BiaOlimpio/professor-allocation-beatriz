package com.project.professorallocation.controller;

import com.project.professorallocation.service.AllocationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {

    private AllocationService allocationService;

    public AllocationController(AllocationService allocationService) {
        this.allocationService = allocationService;
    }
}
