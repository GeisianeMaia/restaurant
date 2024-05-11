package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
    List<Restaurant> findByAddress(String address);
    List<Restaurant> findByTypeKitchen(String typeKitchen);
}
