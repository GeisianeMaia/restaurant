package com.fiap.restaurant.infrastructure.controller;

import com.fiap.restaurant.core.domain.entities.Restaurant;
import com.fiap.restaurant.core.usecases.RegistrationRestaurantUseCase;
import com.fiap.restaurant.core.usecases.SearchRestaurantUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {
    @Autowired
    private RegistrationRestaurantUseCase registrationRestaurantUseCase;

    @Autowired
    private SearchRestaurantUseCase searchRestaurantUseCase;
    @GetMapping
    public List<Restaurant> getListRestaurants(){
        return this.searchRestaurantUseCase.getListRestaurants();

    }

    @GetMapping(value = "/restaurants")
    public ResponseEntity<List<Restaurant>> searchRestaurants(@RequestParam(required = false) UUID id,
                                                              @RequestParam(required = false) String address,
                                                              @RequestParam(required = false) String typeKitchen){
        try {
            List<Restaurant> restaurants = searchRestaurantUseCase.searchRestaurants(id, address, typeKitchen);

            if (restaurants.isEmpty()) {
                return ResponseEntity.notFound().build();
            } else {
                return ResponseEntity.ok(restaurants);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public  Restaurant registerRestaurant(@RequestBody Restaurant restaurant){
        return this.registrationRestaurantUseCase.registerRestaurant(restaurant);
    }
}
