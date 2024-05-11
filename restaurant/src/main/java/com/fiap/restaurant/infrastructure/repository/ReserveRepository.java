package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.Reserve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReserveRepository  extends JpaRepository<Reserve, UUID> {
}
