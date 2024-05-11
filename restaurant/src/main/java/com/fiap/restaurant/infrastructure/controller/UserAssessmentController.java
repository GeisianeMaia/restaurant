package com.fiap.restaurant.infrastructure.controller;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import com.fiap.restaurant.core.usecases.AssessmentCommentsUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/assessmentUsers")
public class UserAssessmentController {
    @Autowired
    private AssessmentCommentsUsersUseCase assessmentCommentsUsersUseCase;

    @GetMapping
    public List<UserAssessment> getListAssessment(){
        return this.assessmentCommentsUsersUseCase.getListAssessment();
    }

    @GetMapping(value = "/id")
    public ResponseEntity<Object> getAssessmentById (@PathVariable UUID id){
        try {
            Optional<UserAssessment> userAssessmentOptional = assessmentCommentsUsersUseCase.getAssessmentById(id);
            return userAssessmentOptional.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public UserAssessment createPostAssessmentCommentsUsers(@RequestBody UserAssessment userAssessment){
        return this.assessmentCommentsUsersUseCase.createPostAssessmentCommentsUsers(userAssessment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAssessment> updateAssessment(@PathVariable UUID id, @RequestBody UserAssessment userAssessment){
        try {
            UserAssessment updatedUserAssessment = assessmentCommentsUsersUseCase.updateAssessment(id, userAssessment);
            if (updatedUserAssessment != null) {
                return ResponseEntity.ok(updatedUserAssessment);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssessment(@PathVariable UUID id){
        try {
            assessmentCommentsUsersUseCase.deleteAssessment(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
