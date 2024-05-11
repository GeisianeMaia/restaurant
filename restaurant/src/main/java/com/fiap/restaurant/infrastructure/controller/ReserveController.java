package com.fiap.restaurant.infrastructure.controller;

import com.fiap.restaurant.core.domain.entities.Reserve;
import com.fiap.restaurant.core.domain.entities.Restaurant;
import com.fiap.restaurant.core.usecases.ReservationManagementUseCase;
import com.fiap.restaurant.core.usecases.TableReservationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {
    @Autowired
    private ReservationManagementUseCase reservationManagementUseCase;

    @Autowired
    private TableReservationUseCase tableReservationUseCase;

    @GetMapping
    public List<Reserve> getListReserve(){
        return null;
    }

    @GetMapping(value = "/id")
    public Reserve getReserveById (@PathVariable String id){
        return null;
    }
    @PostMapping
    public  Reserve createReserveTableRestaurant(@RequestBody Reserve reserve){
        return null;
    }

    @PostMapping(value = "/updateStatus")
    public  Reserve updateStatusTableReserve(@RequestBody Reserve reserve){
        return null;
    }


}
