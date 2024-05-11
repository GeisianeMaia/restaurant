package com.fiap.restaurant.core.usecases;

import com.fiap.restaurant.core.domain.entities.Restaurant;

import java.util.List;
import java.util.UUID;

public interface SearchRestaurantUseCase {

    public List<Restaurant> getListRestaurants();

    List<Restaurant> searchRestaurants(UUID id, String address, String typeKitchen);
}
