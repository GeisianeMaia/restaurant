package com.fiap.restaurant.core.usecases;

import com.fiap.restaurant.core.domain.entities.Reserve;

public interface TableReservationUseCase {
    public Reserve createReserveTableRestaurant(Reserve reserve);
}
