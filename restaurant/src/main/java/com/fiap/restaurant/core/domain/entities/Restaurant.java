package com.fiap.restaurant.core.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String typeKitchen;
    private String hoursOpening;
    private String daysWeekOpening;
    private int limitPeople;


    public Restaurant() {
    }
    public Restaurant(Long id, String name, String address, String typeKitchen, String hoursOpening, String daysWeekOpening, int limitPeople) {

        if(name.isEmpty() || address.isEmpty() || typeKitchen.isEmpty() || hoursOpening.isEmpty() || daysWeekOpening.isEmpty() || limitPeople <= 0){
            throw new IllegalArgumentException("Campo não pode estar vazio.");
        }
        this.id = id;
        this.name = name;
        this.address = address;
        this.typeKitchen = typeKitchen;
        this.hoursOpening = hoursOpening;
        this.daysWeekOpening = daysWeekOpening;
        this.limitPeople = limitPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeKitchen() {
        return typeKitchen;
    }

    public void setTypeKitchen(String typeKitchen) {
        this.typeKitchen = typeKitchen;
    }

    public String getHoursOpening() {
        return hoursOpening;
    }

    public void setHoursOpening(String hoursOpening) {
        this.hoursOpening = hoursOpening;
    }

    public String getDaysWeekOpening() {
        return daysWeekOpening;
    }

    public void setDaysWeekOpening(String daysWeekOpening) {
        this.daysWeekOpening = daysWeekOpening;
    }

    public int getLimitPeople() {
        return limitPeople;
    }

    public void setLimitPeople(int limitPeople) {
        this.limitPeople = limitPeople;
    }


    public Restaurant(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
