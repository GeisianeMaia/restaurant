package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Reserve;
import com.fiap.restaurant.core.usecases.TableReservationUseCase;
import com.fiap.restaurant.infrastructure.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableReservationUseCaseImpl implements TableReservationUseCase {

    private final ReserveRepository reserveRepository;

    public TableReservationUseCaseImpl(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    public Reserve createReserveTableRestaurant(Reserve reserve) {
        return this.reserveRepository.save(reserve);
    }
}
