package com.fiap.restaurant.core.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "campo não pode estar vazio")
    private String nameUser;
    @Column(nullable = false)
    @NotEmpty(message = "campo não pode estar vazio")
    private String messageAssessment;
    @Column(nullable = false)
    @NotEmpty(message = "campo não pode estar vazio")
    private String nameRestaurantAssessment;

    private LocalDateTime dateVisitedRestaurant;
    @Builder.Default
    private LocalDateTime dateAssessment = LocalDateTime.now();
    @Builder.Default
    private int likes=0;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return likes;
    }

    public void setLike(int likes) {
        this.likes = likes;
    }


}
