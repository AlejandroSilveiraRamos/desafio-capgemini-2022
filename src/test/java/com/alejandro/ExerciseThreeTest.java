package com.alejandro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExerciseThreeTest {

    @Test
    public void shouldAnswerWithTwoAnagrams() {
        /** Retorna um total de dois anagramas com a palavra 'ovo' */
        assertEquals(2, ExerciseThree.returnTotalAnagrams("ovo"));
    }

    @Test
    public void shouldAnswerWithThreeAnagrams() {
        /** Retorna um total de três anagramas com a palavra 'ifailuhkqq' */
        assertEquals(3, ExerciseThree.returnTotalAnagrams("ifailuhkqq"));
    }
}
