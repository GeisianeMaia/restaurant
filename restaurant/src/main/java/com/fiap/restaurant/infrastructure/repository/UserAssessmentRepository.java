package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserAssessmentRepository  extends JpaRepository<UserAssessment, UUID> {
}
