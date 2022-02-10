package com.project.professorallocation.controller;

import com.project.professorallocation.entity.Allocation;
import com.project.professorallocation.service.AllocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping (path = "/allocations")
public class AllocationController<id> {


    private AllocationService allocationService;

    public AllocationController(AllocationService allocationService) {
        this.allocationService = allocationService;

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Allocation>> findAll() {
        List<Allocation> departments = allocationService.findAll();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @GetMapping(path = "/{allocation_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Allocation> findById(@PathVariable(name = "allocation_id") Long id) {
        Allocation allocation = allocationService.findById(id);
        if (allocation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {

            return new ResponseEntity<>(allocation, HttpStatus.OK);
        }
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Allocation> create(@RequestBody Allocation allocation) {
        try {
            allocation = allocationService.create(allocation);
            return new ResponseEntity<>(allocation, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(path = "/{department_id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Allocation> update(@PathVariable(name = "allocation_id") Long id, @RequestBody Allocation allocation) {
        allocation.setId(id);
        try {
            allocation = allocationService.update(allocation);
            if (allocation == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(allocation, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}






