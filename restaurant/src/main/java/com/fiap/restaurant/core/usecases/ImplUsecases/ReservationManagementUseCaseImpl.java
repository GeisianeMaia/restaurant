package com.fiap.restaurant.core.usecases.ImplUsecases;

import com.fiap.restaurant.core.domain.entities.Reserve;
import com.fiap.restaurant.core.domain.entities.UserAssessment;
import com.fiap.restaurant.core.usecases.ReservationManagementUseCase;
import com.fiap.restaurant.infrastructure.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ReservationManagementUseCaseImpl implements ReservationManagementUseCase {
    @Autowired
    private ReserveRepository reserveRepository;
    @Override
    public List<Reserve> getListReserve() {
        return this.reserveRepository.findAll();
    }

    @Override
    public Optional<Reserve> getReserveById(UUID id) {
        return this.reserveRepository.findById(id);
    }

    @Override
    public Reserve updateStatusTableReserve(UUID id, Reserve reserve) {

         Reserve searchReserve = reserveRepository.getOne(id);
         searchReserve.setNameRestaurant(reserve.getNameRestaurant());
         searchReserve.setDateReserve(reserve.getDateReserve());
         searchReserve.setFullNameUser(reserve.getFullNameUser());
         searchReserve.setNumberTableReserve(reserve.getNumberTableReserve());
         searchReserve.setPhoneUser(reserve.getPhoneUser());
         searchReserve.setTableReserved(reserve.isTableReserved());
         searchReserve.setQuantityPeopleReserve(reserve.getQuantityPeopleReserve());

         return searchReserve;

    }
}
