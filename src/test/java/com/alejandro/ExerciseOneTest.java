package com.alejandro;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExerciseOneTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    /** Usando streams para testar output do método de print. */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldReturnOneStair() {
        ExerciseOne.printSolution(1);
        assertEquals("*", outContent.toString().trim());
    }

    @Test
    public void shouldReturnTwoStairs() {
        ExerciseOne.printSolution(2);
        assertEquals("*\n**", outContent.toString().trim());
    }
}
