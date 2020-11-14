package ru.ssau.tk.oop.propro;

import junit.framework.TestCase;

import static org.junit.Assert.assertNotEquals;

public class MyArraysTest extends TestCase {

    MyArrays firstArray = new MyArrays();

    public void testArrayLength() {
        assertEquals(firstArray.arrayLength(5).length, 5);
        assertEquals(firstArray.arrayLength(10).length, 10);
        assertNotEquals(firstArray.arrayLength(3).length, 2);
    }
}
