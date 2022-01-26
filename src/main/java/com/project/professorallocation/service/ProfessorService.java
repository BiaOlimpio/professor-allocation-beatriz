package com.project.professorallocation.service;
import com.project.professorallocation.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private ProfessorRepository ProfessorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        ProfessorRepository = professorRepository;
    }
}
