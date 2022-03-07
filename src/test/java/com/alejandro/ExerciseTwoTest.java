package com.alejandro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExerciseTwoTest {

    @Test
    public void shouldAnswerWithFalse() {
        /** Senha sem caractere especial e número deve falhar */
        assertEquals(false, ExerciseTwo.isPasswordSafe("Password"));
    }

    @Test
    public void shouldAnswerWithTrue() {
        /** Senha com todos os requisitos de segurança */
        assertEquals(true, ExerciseTwo.isPasswordSafe("Password123@"));
    }
}
