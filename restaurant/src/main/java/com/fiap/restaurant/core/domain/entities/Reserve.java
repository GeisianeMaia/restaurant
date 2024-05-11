package com.fiap.restaurant.core.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nameRestaurant;
    private LocalDateTime dateReserve;
    private String fullNameUser;
    private String phoneUser;

    private int quantityPeopleReserve;
    private int numberTableReserve;
    private boolean tableReserved;

    public void setQuantityPeopleReserve(int quantityPeopleReserve) {
        this.quantityPeopleReserve = quantityPeopleReserve;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public LocalDateTime getDateReserve() {
        return dateReserve;
    }

    public void setDateReserve(LocalDateTime dateReserve) {
        this.dateReserve = dateReserve;
    }

    public String getFullNameUser() {
        return fullNameUser;
    }

    public void setFullNameUser(String fullNameUser) {
        this.fullNameUser = fullNameUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public int getQuantityPeopleReserve() {
        return quantityPeopleReserve;
    }

    public int getNumberTableReserve() {
        return numberTableReserve;
    }

    public void setNumberTableReserve(int numberTableReserve) {
        this.numberTableReserve = numberTableReserve;
    }

    public boolean isTableReserved() {
        return tableReserved;
    }

    public void setTableReserved(boolean tableReserved) {
        this.tableReserved = tableReserved;
    }

    public Reserve(){}

    public Reserve(UUID id, String nameRestaurant, LocalDateTime dateReserve, String fullNameUser, String phoneUser, int quantityPeopleReserve, int numberTableReserve, boolean tableReserved) {

        if(nameRestaurant.isEmpty() || dateReserve == null || fullNameUser.isEmpty() || phoneUser.isEmpty() || quantityPeopleReserve <= 0){
            throw new IllegalArgumentException("Campo não pode estar vazio.");
        }

        this.id = id;
        this.nameRestaurant = nameRestaurant;
        this.dateReserve = dateReserve;
        this.fullNameUser = fullNameUser;
        this.phoneUser = phoneUser;
        this.quantityPeopleReserve = quantityPeopleReserve;
        this.numberTableReserve = numberTableReserve;
        this.tableReserved = tableReserved;

    }



}
