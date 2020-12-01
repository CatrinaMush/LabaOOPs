package ru.ssau.tk.oop.propro;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringsTest {

    MyStrings myFirstString = new MyStrings();

    @Test
    public void outputMyString() {
        myFirstString.outputMyString("I do not have time for anything :(");
        System.out.println("");
    }

    @Test
    public void byteMyString() {
        myFirstString.byteMyString("Hello");
        System.out.println("");
        myFirstString.byteMyString("Привет");
        System.out.println("");
    }
}