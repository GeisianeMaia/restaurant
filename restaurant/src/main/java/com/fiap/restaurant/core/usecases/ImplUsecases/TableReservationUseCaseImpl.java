package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Reserve;
import com.fiap.restaurant.core.usecases.TableReservationUseCase;
import com.fiap.restaurant.infrastructure.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TableReservationUseCaseImpl implements TableReservationUseCase {
    @Autowired
    private ReserveRepository reserveRepository;
    @Override
    public Reserve createReserveTableRestaurant(Reserve reserve) {
        return this.reserveRepository.save(reserve);

    }
}
