package ru.ssau.tk.oop.propro;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArraysTest {

    MyArrays firstArray = new MyArrays();
    private final static double DELTA = 0.0001;

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

    @Test
    public void increasingOddNumArray() {
        int[] newArray = firstArray.increasingOddNumArray(5);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 3);
        assertEquals(newArray[2], 5);
        assertEquals(newArray[3], 7);
        assertEquals(newArray[4], 9);
    }

    @Test
    public void decreasingEvenNumArray() {
        int[] newArray = firstArray.decreasingEvenNumArray(5);
        assertEquals(newArray[0], 10);
        assertEquals(newArray[1], 8);
        assertEquals(newArray[2], 6);
        assertEquals(newArray[3], 4);
        assertEquals(newArray[4], 2);
    }

    @Test
    public void fibonacciNumArray() {
        int[] newArray = firstArray.fibonacciNumArray(5);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 2);
        assertEquals(newArray[3], 3);
        assertEquals(newArray[4], 5);
        int[] veryNewArray = firstArray.fibonacciNumArray(2);
        assertEquals(veryNewArray[0], 1);
        assertEquals(veryNewArray[1], 1);
    }

    @Test
    public void sqrIndexArray() {
        int[] newArray = firstArray.sqrIndexArray(5);
        assertEquals(newArray[0], 0);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 4);
        assertEquals(newArray[3], 9);
        assertEquals(newArray[4], 16);
    }

    @Test
    public void quadraticEquationResult() {
        double[] firstEquation = firstArray.quadraticEquationResult(2, 3, -27);
        assertEquals(firstEquation[0], -4.5, DELTA);
        assertEquals(firstEquation[1], 3, DELTA);
        assertEquals(firstEquation.length, 2);

        double[] secondEquation = firstArray.quadraticEquationResult(0, 3, 9);
        assertEquals(secondEquation[0], -3, DELTA);
        assertEquals(secondEquation.length, 1);

        double[] thirdEquation = firstArray.quadraticEquationResult(1, 2, 16);
        assertEquals(thirdEquation.length, 0);

        double[] fourthEquation = firstArray.quadraticEquationResult(1, 0, -9);
        assertEquals(fourthEquation[0], -3, DELTA);
        assertEquals(fourthEquation[1], 3, DELTA);
        assertEquals(fourthEquation.length, 2);

        double[] fifthEquation = firstArray.quadraticEquationResult(2, 1, 0);
        assertEquals(fifthEquation[0], -0.5, DELTA);
        assertEquals(fifthEquation[1], 0, DELTA);
        assertEquals(fifthEquation.length, 2);
    }

    @Test
    public void numbersNotDivisibleByThree() {
        int[] newArray = firstArray.numbersNotDivisibleByThree(5);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 2);
        assertEquals(newArray[2], 4);
        assertEquals(newArray[3], 5);
        assertEquals(newArray[4], 7);
    }

    @Test
    public void arithmeticProgressionArray() {
        double[] newArray = firstArray.arithmeticProgressionArray(5, 1.0, 1.2);
        assertEquals(newArray[0], 1.0, DELTA);
        assertEquals(newArray[1], 2.2, DELTA);
        assertEquals(newArray[2], 3.4, DELTA);
        assertEquals(newArray[3], 4.6, DELTA);
        assertEquals(newArray[4], 5.8, DELTA);

        double[] veryNewArray = firstArray.arithmeticProgressionArray(2, 2.0, 0);
        assertEquals(veryNewArray[0], 2.0, DELTA);
        assertEquals(veryNewArray[1], 2.0, DELTA);
    }

    @Test
    public void geometricProgressionArray() {
        double[] newArray = firstArray.geometricProgressionArray(5, 1.0, 1.5);
        assertEquals(newArray[0], 1.0, DELTA);
        assertEquals(newArray[1], 1.5, DELTA);
        assertEquals(newArray[2], 2.25, DELTA);
        assertEquals(newArray[3], 3.375, DELTA);
        assertEquals(newArray[4], 5.0625, DELTA);

        double[] veryNewArray = firstArray.geometricProgressionArray(4, 1.0, 0.5);
        assertEquals(veryNewArray[0], 1.0, DELTA);
        assertEquals(veryNewArray[1], 0.5, DELTA);
        assertEquals(veryNewArray[2], 0.25, DELTA);
        assertEquals(veryNewArray[3], 0.125, DELTA);
    }
}
