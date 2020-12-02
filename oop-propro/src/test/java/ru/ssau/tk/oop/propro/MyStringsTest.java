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

    @Test
    public void palindromeCheck() {
        assertTrue(myFirstString.palindromeCheck("lol"));
        assertFalse(myFirstString.palindromeCheck("hell"));
        assertTrue(myFirstString.palindromeCheck("x"));
    }

    @Test
    public void findSubstringInString() {
        assertEquals(myFirstString.findSubstringInString("cats", "ca"), 0);
        assertEquals(myFirstString.findSubstringInString("phone", "one"), 2);
        assertEquals(myFirstString.findSubstringInString("dogs", "s"), 3);
        assertEquals(myFirstString.findSubstringInString("night", "y"), -1);
    }

    @Test
    public void findSubstringInSecondHalfString() {
        assertEquals(myFirstString.findSubstringInSecondHalfString("apple", "ple"), 2);
        assertEquals(myFirstString.findSubstringInSecondHalfString("orange", "or"), -1);
        assertEquals(myFirstString.findSubstringInSecondHalfString("kiwi", "w"), 2);
        assertEquals(myFirstString.findSubstringInSecondHalfString("kek", "e"), 1);
        assertEquals(myFirstString.findSubstringInSecondHalfString("kek", "k"), 2);
    }
}
