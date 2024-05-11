package com.fiap.restaurant.core.usecases;

import com.fiap.restaurant.core.domain.entities.UserAssessment;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AssessmentCommentsUsersUseCase {

    public UserAssessment createPostAssessmentCommentsUsers(UserAssessment userAssessment);

    public List<UserAssessment> getListAssessment();

    public Optional<UserAssessment> getAssessmentById(UUID id);

    public UserAssessment updateAssessment(UUID id, UserAssessment userAssessment);

    public void deleteAssessment(UUID id);


}
