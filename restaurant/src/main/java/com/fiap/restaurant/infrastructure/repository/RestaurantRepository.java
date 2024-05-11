package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
}
