package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import com.fiap.restaurant.core.usecases.AssessmentCommentsUsersUseCase;
import com.fiap.restaurant.infrastructure.repository.UserAssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssessmentCommentsUsersUseCaseImpl implements AssessmentCommentsUsersUseCase {
    @Autowired
    private UserAssessmentRepository userAssessmentRepository;
    @Override
    public UserAssessment createPostAssessmentCommentsUsers(UserAssessment userAssessment) {
        return this.userAssessmentRepository.save(userAssessment);
    }

    @Override
    public List<UserAssessment> getListAssessment() {
        return this.userAssessmentRepository.findAll();
    }

    @Override
    public Optional<UserAssessment> getAssessmentById(UUID id) {
        return this.userAssessmentRepository.findById(id);
    }

    @Override
    public UserAssessment updateAssessment(UUID id, UserAssessment userAssessment) {
        UserAssessment searchUserAssessment = userAssessmentRepository.getOne(id);
        searchUserAssessment.setNameUser(userAssessment.getNameUser());
        searchUserAssessment.setDateAssessment(userAssessment.getDateAssessment());
        searchUserAssessment.setNameRestaurantAssessment(userAssessment.getNameRestaurantAssessment());
        searchUserAssessment.setMessageAssessment(userAssessment.getMessageAssessment());

        return searchUserAssessment;
    }

    @Override
    public void deleteAssessment(UUID id) {
        userAssessmentRepository.deleteById(id);
    }
}
