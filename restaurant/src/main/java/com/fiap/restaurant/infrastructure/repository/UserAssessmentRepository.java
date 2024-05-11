package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAssessmentRepository  extends JpaRepository<UserAssessment, UUID> {
}
