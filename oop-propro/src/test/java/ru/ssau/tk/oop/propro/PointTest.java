package ru.ssau.tk.oop.propro;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testToString() {
        assertEquals(new Point(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
        assertEquals(new Point(1.1, 1.2, 1.3).toString(), "[1.1, 1.2, 1.3]");
        assertEquals(new Point(-40.1, 1.2, 40.3).toString(), "[-40.1, 1.2, 40.3]");
    }
}