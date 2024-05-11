package com.fiap.restaurant.core.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class UserAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nameUser;
    private String messageAssessment;
    private String nameRestaurantAssessment;
    private LocalDateTime dateVisitedRestaurant;
    private LocalDateTime dateAssessment;
    private int like;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getMessageAssessment() {
        return messageAssessment;
    }

    public void setMessageAssessment(String messageAssessment) {
        this.messageAssessment = messageAssessment;
    }

    public String getNameRestaurantAssessment() {
        return nameRestaurantAssessment;
    }

    public void setNameRestaurantAssessment(String nameRestaurantAssessment) {
        this.nameRestaurantAssessment = nameRestaurantAssessment;
    }

    public LocalDateTime getDateVisitedRestaurant() {
        return dateVisitedRestaurant;
    }

    public void setDateVisitedRestaurant(LocalDateTime dateVisitedRestaurant) {
        this.dateVisitedRestaurant = dateVisitedRestaurant;
    }

    public LocalDateTime getDateAssessment() {
        return dateAssessment;
    }

    public void setDateAssessment(LocalDateTime dateAssessment) {
        this.dateAssessment = dateAssessment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public UserAssessment(){

    }
    public UserAssessment(UUID id, String nameUser, String messageAssessment, String nameRestaurantAssessment, LocalDateTime dateVisitedRestaurant, LocalDateTime dateAssessment, int like) {
        this.id = id;
        this.nameUser = nameUser;
        this.messageAssessment = messageAssessment;
        this.nameRestaurantAssessment = nameRestaurantAssessment;
        this.dateVisitedRestaurant = dateVisitedRestaurant;
        this.dateAssessment = dateAssessment;
        this.like = like;
    }





}
