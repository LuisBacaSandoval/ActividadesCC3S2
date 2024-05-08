package org.example.Sprint1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class Quiz2Test {
    @Test
    public void cargarPreguntas(){
        //Arrange
        Quiz quiz = new Quiz();
        String question1 = "¿Cuál es la capital de Francia?";
        String question2 = "¿Cuál es un numero par?";
        //Act
        quiz.inicialize();
        //Assert
        assertEquals(question1, quiz.preguntas.get(0).getPregunta());
        assertEquals(question2, quiz.preguntas.get(1).getPregunta());
    }
    @Test
    public void verificarEntradas(){
        Quiz quiz = new Quiz();
        String answerUser1 = "5";
        String answerUser2 = "Uno";
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->{
                    quiz.verifyAnswerUser(answerUser1);
                });
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->{
                    quiz.verifyAnswerUser(answerUser2);
                });
    }
}