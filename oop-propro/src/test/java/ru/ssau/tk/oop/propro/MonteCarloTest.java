package ru.ssau.tk.oop.propro;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonteCarloTest {

    MonteCarlo result = new MonteCarlo();
    @Test
    public void integrate() {
        assertEquals(result.integrate(0.0, Math.PI/2, 4000), 1, 0.01);
        assertEquals(result.integrate(0.0, Math.PI, 7000), 2, 0.01);
    }
}