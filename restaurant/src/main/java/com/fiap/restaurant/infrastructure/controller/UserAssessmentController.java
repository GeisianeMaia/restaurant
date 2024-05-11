package com.fiap.restaurant.infrastructure.controller;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import com.fiap.restaurant.core.usecases.AssessmentCommentsUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/assessmentUsers")
public class UserAssessmentController {
    @Autowired
    private AssessmentCommentsUsersUseCase assessmentCommentsUsersUseCase;

    @GetMapping
    public List<UserAssessment> getListAssessment(){
        return null;
    }

    @GetMapping(value = "/id")
    public UserAssessment getAssessmentById (@PathVariable String id){
        return null;
    }

    @PostMapping
    public UserAssessment createPostAssessmentCommentsUsers(@RequestBody UserAssessment userAssessment){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAssessment> updateAssessment(@PathVariable String id, @RequestBody UserAssessment userAssessment){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssessment(@PathVariable String id){
        return null;
    }

}
