package ru.ssau.tk.oop.propro;

public class MyArrays {

    public int[] arrayLength(int l) {
        return new int[l];
    }

    public int[] nearlyOnesArray(int l) {
        int[] myArray = new int[l];
        for (int i = 0; i < l ; i++) {
            myArray[i] = 1;
        }
        myArray[0] = 2;
        myArray[l - 1] = 2;
        return myArray;
    }
}
