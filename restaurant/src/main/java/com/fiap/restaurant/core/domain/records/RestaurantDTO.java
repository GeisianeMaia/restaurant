package com.fiap.restaurant.core.domain.records;

import java.util.UUID;

public record RestaurantDTO(UUID id,
                            String name,
                            String address,
                            String typeKitchen,
                            String hoursOpening,
                            String daysWeekOpening,
                            int limitPeople) {
}
