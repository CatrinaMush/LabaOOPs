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

    @Test
    public void changeSignArray() {
        int[] array = {1, 0, -2, 3};
        firstArray.changeSignArray(array);
        assertEquals(array[0], -1);
        assertEquals(array[1], 0);
        assertEquals(array[2], 2);
        assertEquals(array[3], -3);
    }

    @Test
    public void findNumberInArray() {
        int[] array = {0, 1, 2, 4, 6};
        assertFalse(firstArray.findNumberInArray(array, 5));
        assertTrue(firstArray.findNumberInArray(array, 2));
        assertFalse(firstArray.findNumberInArray(array, 7));
    }

    @Test
    public void checkNullArray() {
        Integer[] firstCheckArray = {1, 0, null, 4, 6};
        Integer[] secondCheckArray = {1, 0, 2, 4, 6};
        assertTrue(firstArray.checkNullArray(firstCheckArray));
        assertFalse(firstArray.checkNullArray(secondCheckArray));
    }

    @Test
    public void countEvenNumbers() {
        int[] firstCheckArray = {1, 0, 8, 4, 6};
        int[] secondCheckArray = {-1, -4, 2, 1, 0};
        assertEquals(firstArray.countEvenNumbers(firstCheckArray), 4);
        assertEquals(firstArray.countEvenNumbers(secondCheckArray), 3);
    }

    @Test
    public void findMax() {
        int[] firstCheckArray = {1, 0, 8, 4, 6};
        int[] secondCheckArray = {-1, -4, 2, 1, 0};
        int[] thirdCheckArray = {};
        assertEquals(firstArray.findMax(firstCheckArray), new Integer(8));
        assertEquals(firstArray.findMax(secondCheckArray), new Integer(2));
        assertNull(firstArray.findMax(thirdCheckArray));
    }

    @Test
    public void sumOfEvenIndex() {
        int[] firstCheckArray = {1, 0, 8, 4, 6};
        int[] secondCheckArray = {-1, -4, 2, 1, 0, 5};
        assertEquals(firstArray.sumOfEvenIndex(firstCheckArray), 15);
        assertEquals(firstArray.sumOfEvenIndex(secondCheckArray), 1);
    }

    @Test
    public void countingDivisors() {
        int[] firstCheckArray = {1, 2, 8, 4, 6};
        int[] secondCheckArray = {5, 6, 9, 1, 3};
        assertTrue(firstArray.countingDivisors(firstCheckArray));
        assertFalse(firstArray.countingDivisors(secondCheckArray));
    }


    @Test
    public void symmetricArray() {
        int[] newArray = firstArray.symmetricArray(7);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 2);
        assertEquals(newArray[2], 3);
        assertEquals(newArray[3], 4);
        assertEquals(newArray[4], 3);
        assertEquals(newArray[5], 2);
        assertEquals(newArray[6], 1);
        int[] newSecondArray = firstArray.symmetricArray(4);
        assertEquals(newSecondArray[0], 1);
        assertEquals(newSecondArray[1], 2);
        assertEquals(newSecondArray[2], 2);
        assertEquals(newSecondArray[3], 1);
        assertNull(firstArray.symmetricArray(0));
    }


    @Test
    public void testGetArrayDivisors() {
        int[] myFirstArray = firstArray.getArrayDivisors(15);
        int[] firstResult = {1, -1, 3, -3, -5, 5, -15, 15};
        for (int i = 0; i < myFirstArray.length; i++)
            assertEquals(myFirstArray[i], firstResult[i]);

        int[] mySecondArray = firstArray.getArrayDivisors(-7);
        int[] secondResult = {1, -1, -3, 3};
        for (int i = 0; i < myFirstArray.length; i++)
            assertEquals(mySecondArray[i], secondResult[i]);
    }

    @Test
    public void findIndexOfNumber() {
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(firstArray.findIndexOfNumber(newArray, 1), 0);
        assertEquals(firstArray.findIndexOfNumber(newArray, 4), 3);
        assertEquals(firstArray.findIndexOfNumber(newArray, 8), 7);
    }

    @Test
    public void exchangedMaxAndMin() {
        int[] myFirstArray = {1, 2, 3, 5, 6};
        firstArray.exchangedMaxAndMin(myFirstArray);
        int[] resultFirstArray = {6, 2, 3, 5, 1};
        for (int i = 0; i < myFirstArray.length; i++)
            assertEquals(myFirstArray[i], resultFirstArray[i]);
        int[] mySecondArray = {0, 1, 2, 0, 8};
        firstArray.exchangedMaxAndMin(mySecondArray);
        int[] resultSecondArray = {8, 1, 2, 0, 0};
        for (int i = 0; i < mySecondArray.length; i++)
            assertEquals(mySecondArray[i], resultSecondArray[i]);
    }

    @Test
    public void bitWiseNegation() {
        int[] newFirstArray = {12, 15, 56};
        firstArray.bitWiseNegation(newFirstArray);
        int[] resultFirstArray = {-13, -16, -57};
        for (int i = 0; i < newFirstArray.length; i++)
            assertEquals(newFirstArray[i], resultFirstArray[i]);

        int[] newSecondArray = {-2, 5, -6};
        firstArray.bitWiseNegation(newSecondArray);
        int[] resultSecondArray = {1, -6, 5};
        for (int i = 0; i < newSecondArray.length; i++)
            assertEquals(newSecondArray[i], resultSecondArray[i]);
    }

    @Test
    public void meanValueArray() {
        double[] newFirstArray = {2, 2, 5, 7};
        assertEquals(firstArray.meanValueArray(newFirstArray), 4, DELTA);
        double[] newSecondArray = {-2, 5, -6};
        assertEquals(firstArray.meanValueArray(newSecondArray), -1, DELTA);
    }

    @Test
    public void dispertionValueArray() {
        double[] newFirstArray = {2, 2, 5, 7};
        assertEquals(firstArray.dispertionValueArray(newFirstArray), 4.5, DELTA);
        double[] newSecondArray = {-2, 5, -6};
        assertEquals(firstArray.dispertionValueArray(newSecondArray), 20.6667, DELTA);
    }

    @Test
    public void arrayBitwiseNot() {
        int[] yesArray = {7, 16, -9};
        int[] notArray = new int[]{-8, -17, 8};
        for (int i = 0; i < yesArray.length; i++)
            assertEquals(firstArray.arrayBitwiseNot(yesArray)[i], notArray[i]);
        for (int i = 0; i < yesArray.length; i++)
            assertEquals(firstArray.arrayBitwiseNot(firstArray.arrayBitwiseNot(yesArray))[i], yesArray[i]);
    }

    @Test
    public void findMostCommonElement() {
        int[] checkNumbers = {1, 1, 1, 2, 3, 3, 3, 4, 7, 6, 5};
        assertEquals(firstArray.findMostCommonElement(checkNumbers), 1);
        int[] checkNumbersTwo = {1, 2, 3, 4, 5, 11, 47, 89, 5, 32, 5, 4};
        assertEquals(firstArray.findMostCommonElement(checkNumbersTwo), 4);
        int[] checkNumbersThree = {0, -2, 3, 0, -5, 0, -4, 6, 0, 6};
        assertEquals(firstArray.findMostCommonElement(checkNumbersThree), 0);
    }
}
