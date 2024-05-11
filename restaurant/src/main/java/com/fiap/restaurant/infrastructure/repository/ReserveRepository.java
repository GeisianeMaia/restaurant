package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.Reserve;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReserveRepository  extends JpaRepository<Reserve, UUID> {
}
