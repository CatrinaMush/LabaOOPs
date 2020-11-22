package ru.ssau.tk.oop.propro;

import static java.lang.StrictMath.sqrt;

public class MyArrays {

    public int[] arrayLength(int l) {
        return new int[l];
    }

    public int[] nearlyOnesArray(int l) {
        int[] myArray = new int[l];
        for (int i = 0; i < l; i++) {
            myArray[i] = 1;
        }
        myArray[0] = 2;
        myArray[l - 1] = 2;
        return myArray;
    }

    public int[] increasingOddNumArray(int l) {
        int[] myArray = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k + 2;
        }
        return myArray;
    }

    public int[] decreasingEvenNumArray(int l) {
        int[] myArray = new int[l];
        int k = 2 * l;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }

    public int[] fibonacciNumArray(int l) {
        int[] fibArray = new int[l];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i = 2; i < l; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }

    public int[] sqrIndexArray(int l) {
        int[] mySqrIndexArray = new int[l];
        for (int i = 0; i < l; i++) {
            mySqrIndexArray[i] = i * i;
        }
        return mySqrIndexArray;
    }

    public double[] quadraticEquationResult(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if ((discriminant == 0) & (a > 0)) {
            double[] result = new double[1];
            result[0] = -b / (2 * a);
            return result;
        }
        if ((discriminant > 0) & (a > 0)) {
            double[] result = new double[2];
            result[0] = (-b - sqrt(discriminant)) / (2 * a);
            result[1] = (-b + sqrt(discriminant)) / (2 * a);
            return result;
        }
        if (a == 0) {
            double[] result = new double[1];
            result[0] = -c / b;
            return result;
        }
        return new double[0];
    }

    public int[] numbersNotDivisibleByThree(int l) {
        int[] myNumbersNotDivisibleByThree = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myNumbersNotDivisibleByThree[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return myNumbersNotDivisibleByThree;
    }
}
