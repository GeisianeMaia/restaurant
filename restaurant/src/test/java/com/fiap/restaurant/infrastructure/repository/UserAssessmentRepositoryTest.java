package com.fiap.restaurant.infrastructure.repository;

import com.fiap.restaurant.core.domain.entities.UserAssessment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
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
    void tearDown() throws Exception{
        openMocks.close();
    }
    @Test
    void shouldAllowRegisterAssessment(){
        UserAssessment message = generatedAssessment();

        when(userAssessmentRepository.save(any(UserAssessment.class))).thenReturn(message);
        var messageSave = userAssessmentRepository.save(message);
        assertThat(messageSave).isNotNull().isEqualTo(message);
        verify(userAssessmentRepository, times(1)).save(any(UserAssessment.class));
    }

    @Test
    void shouldAllowDeleteAssessment(){
        var id = UUID.randomUUID();
        doNothing().when(userAssessmentRepository).deleteById(any(UUID.class));
        userAssessmentRepository.deleteById(id);

        verify(userAssessmentRepository, times(1)).deleteById(any(UUID.class));
    }


    @Test
    void shouldAllowSearchIdAssessment(){
        var id = generatedNumberRandom();
        var assessment = generatedAssessment();
        assessment.setId(id);

        when(userAssessmentRepository.findById(any(Long.class)))
                .thenReturn(Optional.of(assessment));

        // Act
        var assessmentReceivedOptional = userAssessmentRepository.findById(id);

        // Assert
        assertThat(assessmentReceivedOptional)
                .isPresent()
                .containsSame(assessment);
    }

    private UserAssessment generatedAssessment(){
        return UserAssessment.builder().id(generatedNumberRandom()).nameUser("Maria").nameRestaurantAssessment("Chefs").messageAssessment("conteudo mensagem").build();
    }

    private long generatedNumberRandom(){
        Random random = new Random();
        return random.nextLong();
    }
}
