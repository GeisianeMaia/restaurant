package com.fiap.restaurant.infrastructure.controller;

import com.fiap.restaurant.core.domain.entities.Reserve;
import com.fiap.restaurant.core.domain.entities.UserAssessment;
import com.fiap.restaurant.core.usecases.ReservationManagementUseCase;
import com.fiap.restaurant.core.usecases.TableReservationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {
    @Autowired
    private ReservationManagementUseCase reservationManagementUseCase;

    @Autowired
    private TableReservationUseCase tableReservationUseCase;

    @GetMapping
    public List<Reserve> getListReserve(){
        return this.reservationManagementUseCase.getListReserve();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getReserveById (@PathVariable UUID id){
        try {
            Optional<Reserve> reserveOptional = reservationManagementUseCase.getReserveById(id);
            return reserveOptional.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
    @PostMapping
    public  Reserve createReserveTableRestaurant(@RequestBody Reserve reserve){
        return this.tableReservationUseCase.createReserveTableRestaurant(reserve);
    }

    @PutMapping(value = "/updateStatus/{id}")
    public ResponseEntity<Object> updateStatusTableReserve(@PathVariable UUID id,@RequestBody Reserve reserve){
        try {
            Reserve updatedStatusTable = reservationManagementUseCase.updateStatusTableReserve(id, reserve);
            if (updatedStatusTable != null) {
                return ResponseEntity.ok(updatedStatusTable);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
