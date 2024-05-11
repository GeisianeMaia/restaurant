package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import com.fiap.restaurant.core.usecases.RegistrationRestaurantUseCase;
import com.fiap.restaurant.infrastructure.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationRestaurantUseCaseImpl implements RegistrationRestaurantUseCase {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public Restaurant registerRestaurant(Restaurant restaurant) {

        return this.restaurantRepository.save(restaurant);
    }
}
