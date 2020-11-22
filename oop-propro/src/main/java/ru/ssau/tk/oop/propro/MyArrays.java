package ru.ssau.tk.oop.propro;

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
}
