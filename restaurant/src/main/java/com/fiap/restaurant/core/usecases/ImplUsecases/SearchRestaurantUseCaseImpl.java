package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import com.fiap.restaurant.core.usecases.SearchRestaurantUseCase;
import com.fiap.restaurant.infrastructure.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class SearchRestaurantUseCaseImpl implements SearchRestaurantUseCase {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> getListRestaurants() {
        return this.restaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> searchRestaurants(UUID id, String address, String typeKitchen) {
        if (id != null) {
            return List.of(restaurantRepository.findById(id).orElse(null));
        } else if (address != null) {
            return this.restaurantRepository.findByAddress(address);
        } else if (typeKitchen != null) {
            return this.restaurantRepository.findByTypeKitchen(typeKitchen);
        } else {
            return restaurantRepository.findAll();
        }
    }
}
