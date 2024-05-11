package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import com.fiap.restaurant.core.usecases.RegistrationRestaurantUseCase;
import com.fiap.restaurant.infrastructure.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationRestaurantUseCaseImpl implements RegistrationRestaurantUseCase {

    private final RestaurantRepository restaurantRepository;

    public RegistrationRestaurantUseCaseImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant registerRestaurant(Restaurant restaurant) {

        return this.restaurantRepository.save(restaurant);
    }
}
