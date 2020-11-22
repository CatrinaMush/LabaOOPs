package ru.ssau.tk.oop.propro;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArraysTest {

    MyArrays firstArray = new MyArrays();

    @Test
    public void arrayLength() {
        assertEquals(firstArray.arrayLength(5).length, 5);
        assertEquals(firstArray.arrayLength(10).length, 10);
        assertNotEquals(firstArray.arrayLength(3).length, 2);
    }

    @Test
    public void nearlyOnesArray() {
        int[] newArray = firstArray.nearlyOnesArray(5);
        assertEquals(newArray[0], 2);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 1);
        assertEquals(newArray[3], 1);
        assertEquals(newArray[4], 2);

        int[] veryNewArray = firstArray.nearlyOnesArray(2);
        assertEquals(veryNewArray[0], 2);
        assertEquals(veryNewArray[1], 2);
    }
}
