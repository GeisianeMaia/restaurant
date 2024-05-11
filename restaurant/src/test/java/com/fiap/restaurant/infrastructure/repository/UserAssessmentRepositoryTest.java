package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class UserAssessmentRepositoryTest {

    @Mock
    private UserAssessmentRepository userAssessmentRepository;

    AutoCloseable openMocks;

    @BeforeEach
    void setup(){
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    void shouldAllowRegisterMessageAssessmentRestaurant(){
        fail("teste não implementado")
        ;
    }

    @Test
    void shouldAllowSearchMessageAssessmentRestaurant(){
        fail("teste não implementado")
        ;
    }

    @Test
    void shouldAllowChangeMessageAssessmentRestaurant(){
        fail("teste não implementado")
        ;
    }

    @Test
    void shouldAllowDeleteMessageAssessmentRestaurant(){
        fail("teste não implementado")
        ;
    }
}
