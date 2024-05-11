package com.fiap.restaurant.core.usecases;

import com.fiap.restaurant.core.domain.entities.Reserve;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReservationManagementUseCase {

    public List<Reserve> getListReserve();
    public Optional<Reserve> getReserveById(UUID id);
    public Reserve updateStatusTableReserve (UUID id, Reserve reserve);
}
